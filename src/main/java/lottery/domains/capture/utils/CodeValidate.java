 package lottery.domains.capture.utils;

 import javautils.StringUtil;

 public class CodeValidate {
   public static boolean validate(String lottery, String code) {
     switch (lottery) {
     case "cqssc":
     case "xjssc":
     case "tjssc":
     case "tw5fc":
     case "bj5fc":
     case "jnd3d5fc":
     case "txffc":
       return isSsc(code);
     case "sd11x5":
     case "gd11x5":
     case "jx11x5":
     case "ah11x5":
       return is11x5(code);
     case "jsk3":
     case "ahk3":
     case "jlk3":
     case "hbk3":
     case "shk3":
       return isK3(code);
     case "fc3d":
     case "pl3":
       return is3d(code);
     case "bjkl8":
       return isBjkl8(code);
     case "bjpk10":
       return isBjpk10(code);
     }
     return true;
   }


   public static boolean isSsc(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 5)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 1)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 0) || (tmpC > 9))
         return false;
     }
     return true;
   }

   public static boolean is11x5(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 5)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 2)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 1) || (tmpC > 11))
         return false;
     }
     return true;
   }

   public static boolean isK3(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 3)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 1)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 1) || (tmpC > 6))
         return false;
     }
     return true;
   }

   public static boolean is3d(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 3)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 1)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 0) || (tmpC > 9))
         return false;
     }
     return true;
   }

   public static boolean isBjkl8(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 20)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 2)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 1) || (tmpC > 80))
         return false;
     }
     return true;
   }

   public static boolean isBjpk10(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 10)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 2)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 1) || (tmpC > 10))
         return false;
     }
     return true;
   }

   public static boolean isKy481(String s)
   {
     if (!StringUtil.isNotNull(s))
       return false;
     String[] codes = s.split(",");

     if (codes.length != 4)
       return false;
     for (String tmpS : codes)
     {
       if (!StringUtil.isInteger(tmpS)) {
         return false;
       }
       if (tmpS.length() != 1)
         return false;
       int tmpC = Integer.parseInt(tmpS);

       if ((tmpC < 1) || (tmpC > 8))
         return false;
     }
     return true;
   }
 }


/* Location:              /Users/vincent/Downloads/至尊程序/lotteryCapture/lotteryCaptureRepair.jar!/lottery/domains/capture/utils/CodeValidate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */