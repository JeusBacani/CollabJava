public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      name = name.toUpperCase();
      
      String[] names = name.split(" ");
      
      return names[0].charAt(0)+"."+names[1].charAt(0);
    }
  }
