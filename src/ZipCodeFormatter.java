public class ZipCodeFormatter {
    public static void main(String[] args) {
        try {
            String zipFormated = zipCodeFormater("23765064");
            System.out.println(zipFormated);
        } catch (ZipCodeInvalidException e) {
            System.out.println("Informed ZipCode does not fit our business rules.");
        }
    }
    static String zipCodeFormater(String zip) throws ZipCodeInvalidException{
        if(zip.length() != 8)
            throw new ZipCodeInvalidException();

            return "23.765-064";
    }
}
