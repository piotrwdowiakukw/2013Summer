package me.xiangchen.technique.handsense;

public class HandSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) HandSenseClassifier_0.classify(i)] += 3.195753407447339;
	    sums[(int) HandSenseClassifier_1.classify(i)] += 2.7269186854065928;
	    sums[(int) HandSenseClassifier_2.classify(i)] += 2.528616038037083;
	    sums[(int) HandSenseClassifier_3.classify(i)] += 2.0541482284604045;
	    sums[(int) HandSenseClassifier_4.classify(i)] += 2.5898887334813043;
	    sums[(int) HandSenseClassifier_5.classify(i)] += 2.9748413497018444;
	    sums[(int) HandSenseClassifier_6.classify(i)] += 2.56312735655024;
	    sums[(int) HandSenseClassifier_7.classify(i)] += 2.542088879868883;
	    sums[(int) HandSenseClassifier_8.classify(i)] += 3.489921016169964;
	    sums[(int) HandSenseClassifier_9.classify(i)] += 3.2538635026295446;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class HandSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_0.N3c80d0bb23(i);
	    return p;
	  }
	  static double N3c80d0bb23(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.58) {
	    p = HandSenseClassifier_0.N2d07c40524(i);
	    } else if (((Double) i[87]).doubleValue() > 0.58) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2d07c40524(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.51) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() > 7.51) {
	    p = HandSenseClassifier_0.N58d63b5b25(i);
	    } 
	    return p;
	  }
	  static double N58d63b5b25(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() <= 1.07) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() > 1.07) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_1.N58d300ed26(i);
	    return p;
	  }
	  static double N58d300ed26(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.05) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -7.05) {
	    p = HandSenseClassifier_1.N4e1f52a27(i);
	    } 
	    return p;
	  }
	  static double N4e1f52a27(Object []i) {
	    double p = Double.NaN;
	    if (i[73] == null) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() <= 1.76) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() > 1.76) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_2.Nea69ae728(i);
	    return p;
	  }
	  static double Nea69ae728(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.56) {
	    p = HandSenseClassifier_2.N5c03bb3429(i);
	    } else if (((Double) i[0]).doubleValue() > 0.56) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c03bb3429(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 0;
	    } else if (((Double) i[83]).doubleValue() <= 9.59) {
	    p = HandSenseClassifier_2.N78f7821d30(i);
	    } else if (((Double) i[83]).doubleValue() > 9.59) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N78f7821d30(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.96) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 5.96) {
	    p = HandSenseClassifier_2.N417f7bf631(i);
	    } 
	    return p;
	  }
	  static double N417f7bf631(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() <= -9.19) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() > -9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_3.N18a3751232(i);
	    return p;
	  }
	  static double N18a3751232(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 0;
	    } else if (((Double) i[78]).doubleValue() <= 0.6) {
	    p = HandSenseClassifier_3.N135afd6133(i);
	    } else if (((Double) i[78]).doubleValue() > 0.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N135afd6133(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.69) {
	    p = HandSenseClassifier_3.N3ab0f53434(i);
	    } else if (((Double) i[0]).doubleValue() > 0.69) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ab0f53434(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() <= 0.36) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() > 0.36) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_4.N37b2470635(i);
	    return p;
	  }
	  static double N37b2470635(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -8.27) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -8.27) {
	    p = HandSenseClassifier_4.N1954f77b36(i);
	    } 
	    return p;
	  }
	  static double N1954f77b36(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 1.73) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 1.73) {
	    p = HandSenseClassifier_4.N1943b93b37(i);
	    } 
	    return p;
	  }
	  static double N1943b93b37(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.9) {
	    p = HandSenseClassifier_4.N2d35dd7238(i);
	    } else if (((Double) i[87]).doubleValue() > 0.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2d35dd7238(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() <= 3.83) {
	    p = HandSenseClassifier_4.N2b5d7e8e39(i);
	    } else if (((Double) i[105]).doubleValue() > 3.83) {
	    p = HandSenseClassifier_4.N71fb2e040(i);
	    } 
	    return p;
	  }
	  static double N2b5d7e8e39(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 0;
	    } else if (((Double) i[20]).doubleValue() <= 9.61) {
	      p = 0;
	    } else if (((Double) i[20]).doubleValue() > 9.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N71fb2e040(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.02) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 0.02) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_5.N321893c741(i);
	    return p;
	  }
	  static double N321893c741(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= -0.79) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() > -0.79) {
	    p = HandSenseClassifier_5.N6b8e078242(i);
	    } 
	    return p;
	  }
	  static double N6b8e078242(Object []i) {
	    double p = Double.NaN;
	    if (i[73] == null) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() <= 1.85) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() > 1.85) {
	    p = HandSenseClassifier_5.N398f1ef843(i);
	    } 
	    return p;
	  }
	  static double N398f1ef843(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() <= 7.72) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() > 7.72) {
	    p = HandSenseClassifier_5.N633a494d44(i);
	    } 
	    return p;
	  }
	  static double N633a494d44(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -0.29) {
	    p = HandSenseClassifier_5.N7a2912045(i);
	    } else if (((Double) i[6]).doubleValue() > -0.29) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7a2912045(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 0;
	    } else if (((Double) i[86]).doubleValue() <= 9.32) {
	      p = 0;
	    } else if (((Double) i[86]).doubleValue() > 9.32) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_6.N41e5cfca46(i);
	    return p;
	  }
	  static double N41e5cfca46(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.69) {
	    p = HandSenseClassifier_6.N56acf89247(i);
	    } else if (((Double) i[0]).doubleValue() > 0.69) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N56acf89247(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() <= 8.94) {
	    p = HandSenseClassifier_6.N75f365b248(i);
	    } else if (((Double) i[35]).doubleValue() > 8.94) {
	    p = HandSenseClassifier_6.N617ce68650(i);
	    } 
	    return p;
	  }
	  static double N75f365b248(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= -0.45) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > -0.45) {
	    p = HandSenseClassifier_6.N3e99c59d49(i);
	    } 
	    return p;
	  }
	  static double N3e99c59d49(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() <= 0.92) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() > 0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N617ce68650(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 0;
	    } else if (((Double) i[85]).doubleValue() <= 2.51) {
	      p = 0;
	    } else if (((Double) i[85]).doubleValue() > 2.51) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_7.N4f02996a51(i);
	    return p;
	  }
	  static double N4f02996a51(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.81) {
	    p = HandSenseClassifier_7.N33a626ac52(i);
	    } else if (((Double) i[107]).doubleValue() > 7.81) {
	    p = HandSenseClassifier_7.N613500b153(i);
	    } 
	    return p;
	  }
	  static double N33a626ac52(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= 0.4) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() > 0.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N613500b153(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() <= -4.6) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() > -4.6) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_8.N5ec0965254(i);
	    return p;
	  }
	  static double N5ec0965254(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.57) {
	    p = HandSenseClassifier_8.N35cd121755(i);
	    } else if (((Double) i[44]).doubleValue() > 9.57) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N35cd121755(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -9.81) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -9.81) {
	    p = HandSenseClassifier_8.N2a5ebf9956(i);
	    } 
	    return p;
	  }
	  static double N2a5ebf9956(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.67) {
	    p = HandSenseClassifier_8.N3274eb8a57(i);
	    } else if (((Double) i[87]).doubleValue() > 0.67) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3274eb8a57(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 9.51) {
	    p = HandSenseClassifier_8.N1a13cae758(i);
	    } else if (((Double) i[62]).doubleValue() > 9.51) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1a13cae758(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.51) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() > 7.51) {
	    p = HandSenseClassifier_8.N96e111159(i);
	    } 
	    return p;
	  }
	  static double N96e111159(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 1.38) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_9.N192277ed60(i);
	    return p;
	  }
	  static double N192277ed60(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 0;
	    } else if (((Double) i[88]).doubleValue() <= 1.93) {
	      p = 0;
	    } else if (((Double) i[88]).doubleValue() > 1.93) {
	    p = HandSenseClassifier_9.N25ef757f61(i);
	    } 
	    return p;
	  }
	  static double N25ef757f61(Object []i) {
	    double p = Double.NaN;
	    if (i[106] == null) {
	      p = 0;
	    } else if (((Double) i[106]).doubleValue() <= -5.98) {
	    p = HandSenseClassifier_9.Nc0af84e62(i);
	    } else if (((Double) i[106]).doubleValue() > -5.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nc0af84e62(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 9.14) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() > 9.14) {
	      p = 1;
	    } 
	    return p;
	  }
	}