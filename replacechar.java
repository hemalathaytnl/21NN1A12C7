class replacechar {
    public static void main(String[] args) {
        String str = "apple";
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                s += 'p';  
            } else if (str.charAt(i) == 'p') {
                s += 'a'; 
            } else {
                s += str.charAt(i);  
            }
        }

        System.out.println(s);
    }
}
