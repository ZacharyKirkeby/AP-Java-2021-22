public class Main {

  public static void main(String[] args) {
    // write methods
    String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
    String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
    String patient3 = "GATCGATGTGCAGACTAGCGATCACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTACGATCAGATCGTCAGGACGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATCGTCAGGAC";

    printReport(patient1);
    printReport(patient2);
    printReport(patient3);
  }

  private static void printReport(String patient) {
    System.out.println("DNA Test");
    System.out.println("Howlett Syndrome: " + hasHowlettSyndrome(patient));
    System.out.println("Parker Syndrome: " + hasParkerSyndrome(patient));
    System.out.println("Banner Syndrome: " + hasBannerSyndrome(patient));
    System.out.println("Danvers Syndrome: " + hasDanversSyndrome(patient));
    System.out.println("Stark Syndrome: " + hasStarkSyndrome(patient));
    System.out.println("Romanova Syndrome: " + hasRomanovaSyndrome(patient));

  }

  /*
   * Howlett's Syndrome is characterized by excessive hair growth, especially on
   * the face, and internal pain in phalangeal region of the hands. Howlett's is
   * represented in DNA by the sequence: ACGTTCGAGATCGA.
   */
  public static boolean hasHowlettSyndrome(String patient) {
    if (!(patient.indexOf("ACGTTCGAGATCGA") >= 0)) {
      return false;
    } else
      return true;

  }
  /*
   * Parker's Syndrome is characterized by heightened perception, strong visual
   * acuity, and gelatinous discharge from pores in the hands and wrists. Parker's
   * is represented in DNA by the sequence GTACCAGTACGATCAG
   */

  public static boolean hasParkerSyndrome(String patient) {
    if (!(patient.indexOf("GTACCAGTACGATCAG") >= 0)) {
      return false;
    } else
      return true;

  }

  /*
   * Banner's Syndrome is characterized by increased irritability and
   * unpredictable behavior when under stress. Banner's is represented in DNA by
   * the sequence CGTAGATCATGACGA.
   */
  public static boolean hasBannerSyndrome(String patient) {
    if (!(patient.indexOf("CGTAGATCATGACGA") >= 0)) {
      return false;
    } else
      return true;
  }

  /*
   * Danvers' Syndrome is characterized by repeated bouts of memory loss and
   * authoritative personality traits. Danvers' is represented in DNA by the
   * sequence ACTGGTCA only if it found in the second half of one's DNA. If any
   * part of the sequence is in the first half of one's DNA, it has no effect.
   */
  public static boolean hasDanversSyndrome(String patient) {
    boolean has = false;
    if (patient.substring(patient.length() / 2, patient.length()).indexOf("ACTGGTCA") != -1) {
      has = true;
    }
    if (has == true) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Stark's Syndrome is characterized by high levels of both intellect and
   * narcissism, along with irregular heartbeat patterns. Stark's is represented
   * in DNA by the sequence GATCGATGTGCAGACTAGCGAT only if it is found, in its
   * entirety, in the first half of one's DNA sequence. If any part of the
   * sequence is located in the second half of one's DNA, it has no effect.
   */
  public static boolean hasStarkSyndrome(String patient) {
    if ((patient.substring(0, patient.length() / 2).indexOf("GATCGATGTGCAGACTAGCGAT") != -1) && !(patient.indexOf("GATCGATGTGCAGACTAGCGAT") > patient.length() /2)) {
      return true;
    } else {
      return false;
    }

  }

  /*
   * Romanova's Syndrome is characterized by highly levels of empathy for others
   * and tendencies to exhibit reckless behavior when under duress. Romanova's is
   * a little bit trickier to identify. It is represented by two distinct
   * occurrences of the sequence GTCAGGAC in one's DNA. If it occurs only once, it
   * has no effect.
   */
  public static boolean hasRomanovaSyndrome(String patient) {
    if ((patient.substring(0, patient.length() / 2).indexOf("GTCAGGAC") != -1) && (patient.indexOf("GTCAGGAC") >= patient.length() / 2)){
      return true;
    } else {
      return false;
    }
  }

}
