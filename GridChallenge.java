class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    int numberOfCollumn=grid.get(0).length();
    int numberOfLines=grid.size();
    
    
    int collumn=0;
    int lines=0;
    for (int i = 0; i < grid.size(); i++) {
                char[] chararray = grid.get(i).toCharArray();
                Arrays.sort(chararray);
                grid.set(i, new String(chararray));
            }
    while(collumn<numberOfCollumn){
        lines=0;
        while(lines<numberOfLines-1){
            int asci1=(int)grid.get(lines).charAt(collumn);
            int asci2=(int)grid.get(lines+1).charAt(collumn);
            if(asci1>asci2){
                return "NO";
            }
            lines++;
        }
    
        collumn++;
    }
    
    return "YES";
    
    
    }

}