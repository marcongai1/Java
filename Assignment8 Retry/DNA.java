import java.util.ArrayList;

public class DNA {

    private Profile[] database;       // Holds all of the profile objects.
    private String[]  STRsOfInterest; // Holds all of the STRs as Strings we are interested in looking for.

    public DNA (String databaseFile, String STRsFile) {
        createDatabaseOfProfiles(databaseFile); // Calls createDatabase method to initialize the database array
        readSTRsOfInterest(STRsFile); // Calls readAllSTRs method to initialize the allSTRs array
    }

    public void createDatabaseOfProfiles (String filename) {
        StdIn.setFile(filename);
        int p = StdIn.readInt();
        StdIn.readLine();

        this.database = new Profile[p];

        for(int i = 0; i<p; i++){
            String person = StdIn.readLine();
            String fSequence = StdIn.readLine();
            String sSequence = StdIn.readLine();

            database[i] = new Profile(person, null, null, fSequence, sSequence);
        }
    }

    public void readSTRsOfInterest (String filename) {
        StdIn.setFile(filename);
        int s = StdIn.readInt();
        StdIn.readLine();

        this.STRsOfInterest = new String[s];

        for(int i = 0; i<s; i++){
            STRsOfInterest[i] = StdIn.readLine();
        }
    }

    public Profile createUnknownProfile (String filename){
	    StdIn.setFile(filename);
        String first = StdIn.readLine();
        String second = StdIn.readLine();

        Profile unknown = new Profile("Unknown", null, null, first, second);

        return unknown; 
    }

    public STR findSTRInSequence(String sequence, String STR) {

        int sequenceLength = sequence.length();
        int STRlength = STR.length();
        int repeats = 0;
        int count = 0;
        int totalRepeats = 0;

        if(sequenceLength < STRlength){
            totalRepeats = 0;
        }
        else{
            for(int i = 0; i<sequenceLength; i++){
                if(sequence.charAt(i) == STR.charAt(count)){
                    count++;
                    if(count == STRlength){
                        repeats++;
                        count = 0;
                        if(repeats > totalRepeats){
                            totalRepeats = repeats;
                        }
                    }
                }
                else if (sequence.charAt(i) == STR.charAt(0)){
                    count = 0;
                    repeats = 0;
                    i--;
                }
                else{
                    count = 0;
                    repeats = 0;
                }

            }
        }

        STR newstr = new STR(STR, totalRepeats);
        return newstr;
    }

    public void createProfileSTRs (Profile profile, String[] allSTRs) {

        int length = allSTRs.length;
        STR[] str1 = new STR[length];
        STR[] str2 = new STR[length];

        for(int i = 0; i<length; i++){
            str1[i] = findSTRInSequence(profile.getSequence1(), allSTRs[i]);
            str2[i] = findSTRInSequence(profile.getSequence2(), allSTRs[i]);
        }

        profile.setS1_STRs(str1);
        profile.setS2_STRs(str2);

    }

    public void createDatabaseSTRs() {
        int length = database.length;

        for(int i = 0; i < length; i++){
            createProfileSTRs(database[i], STRsOfInterest);
        }
    }
    
    public boolean identicalSTRs(STR[] s1, STR[] s2){

        boolean isTrue = true;

        for(int i = 0; i < s1.length; i++){
            if (s1[i].getSTR().equals(s2[i].getSTR()) && (s1[i].getRepeats() == s2[i].getRepeats())){
                isTrue = true;
            }
            else{
                isTrue = false;
                break;
            }
        }

        return isTrue;
    }

    public ArrayList<Profile> findMatchingProfiles(STR[] unknownProfileS1_STRs){

        int length = database.length;

        ArrayList<Profile> matches = new ArrayList<>();

        for(int i=0; i < length; i++){
            boolean isMatch = identicalSTRs(unknownProfileS1_STRs, database[i].getS1_STRs());
            if(isMatch == true){
                matches.add(database[i]);
            }
        }

	    return matches;
    }

    public boolean punnetSquare( STR[] firstParent,  STR[] inheritedFromFirstParent, 
                                 STR[] secondParent, STR[] inheritedFromSecondParent ) {

        for ( int i = 0; i < firstParent.length; i++ ) {

            if (!(firstParent[i].equals(inheritedFromFirstParent[i]) && secondParent[i].equals(inheritedFromSecondParent[i]))){
                return false;
            }
        }
        return true; 
    }

    /*
     * Looks at the STR sequences of any given person and tries to find the
     * potential relatives (parents) of that person based on their STR sequences
     * 
     * S1_STRs  Kid's STR the 1st parent passed down
     * S2_STRs  Kid's STR the 2nd parent passed down
     * Returns the array of profiles that are related
     */
    public ArrayList<Profile> findPossibleParents (STR[] S1_STRs, STR[] S2_STRs) {

        /* FIX THIS METHOD */

         ArrayList<Profile> possibleParent1 = new ArrayList<>();
         ArrayList<Profile> possibleParent2 = new ArrayList<>();

         for (int i = 0; i < database.length; i++) {
            if (identicalSTRs(database[i].getS1_STRs(), S1_STRs) || identicalSTRs(database[i].getS2_STRs(), S1_STRs)) {
                possibleParent1.add(database[i]);
            }
            if (identicalSTRs(database[i].getS1_STRs(), S2_STRs) || identicalSTRs(database[i].getS2_STRs(), S2_STRs)) {
                 possibleParent2.add(database[i]);
            }
        }

        ArrayList<Profile> parentList = new ArrayList<>();

        for (int p1 = 0; p1 < possibleParent1.size(); p1++) {
            for (int p2 = 0; p2 < possibleParent2.size(); p2++) {
                if (!possibleParent1.get(p1).equals(possibleParent2.get(p2))) {
                    if (punnetSquare(possibleParent1.get(p1).getS1_STRs(), S1_STRs, possibleParent2.get(p2).getS1_STRs(), S2_STRs)
                        || punnetSquare(possibleParent1.get(p1).getS1_STRs(), S1_STRs, possibleParent2.get(p2).getS2_STRs(), S2_STRs)
                        || punnetSquare(possibleParent1.get(p1).getS2_STRs(), S1_STRs, possibleParent2.get(p2).getS1_STRs(), S2_STRs)
                        || punnetSquare(possibleParent1.get(p1).getS2_STRs(), S1_STRs, possibleParent2.get(p2).getS2_STRs(), S2_STRs)) {
                        parentList.add(possibleParent1.get(p1));
                        parentList.add(possibleParent2.get(p2));
                    }
                }
            }
        }
        return parentList;
    }


    public Profile[] getDatabase() {
        return database;
    }

    public String[] getSTRsOfInterest() {
        return STRsOfInterest;
    }
}
