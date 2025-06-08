package regex;

import java.util.*;

public class RegexRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        try{
        do{
        System.out.println("\nSelect a operation:");
        System.out.println("1. Mobile Number Validation");
        System.out.println("2. Alphanumeric String Validation");
        System.out.println("3. String Match (start, contain, end, exact)");
        System.out.println("4. Case-insensitive Match in List");
        System.out.println("5. Email Validation");
        System.out.println("6. Filter Strings by Length (1-6)");
        System.out.println("7. Matching Strings Index Map (List1 & List2)");
        System.out.println("8. Extract HTML Tags");
        System.out.println("0. Exit");
        System.out.println("Enter you choice...");

        choice = scanner.nextInt();scanner.nextLine();
        switch (choice) {
            case 1:
            	try {
                System.out.print("Enter a mobile number: ");
                String mobile = scanner.nextLine();
                System.out.println("Valid Mobile: " + RegexUtility.isValidMobileNumber(mobile));
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
        break;

            case 2:
            	try
            	{
                System.out.print("Enter an alphanumeric string: ");
                String alphanum = scanner.nextLine();
                System.out.println("Is Alphanumeric: " + RegexUtility.isAlphaNumeric(alphanum));
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
        break;

            case 3:
            	try {
                System.out.print("Enter the main string: ");
                String given = scanner.nextLine();
                System.out.print("Enter the matching string: ");
                String match = scanner.nextLine();
                System.out.println("Starts With: " + RegexUtility.startsWith(given, match));
                System.out.println("Contains: " + RegexUtility.contains(given, match));
                System.out.println("Ends With: " + RegexUtility.endsWith(given, match));
                System.out.println("Exact Match: " + RegexUtility.exactMatch(given, match));
            	} catch (Exception e) {
        		System.out.println("An error occurred: " + e.getMessage());
    			}
            	break;

            case 4:
            	try {
                System.out.print("Enter number of strings in list: ");
                int n = scanner.nextInt();scanner.nextLine();
                List<String> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter string " + (i + 1) + ": ");
                    list.add(scanner.nextLine());
                }
                System.out.print("Enter a string to match (case-insensitive): ");
                String matchStr = scanner.nextLine();
                System.out.println("Match found (ignore case): " + RegexUtility.listContainsIgnoreCase(list, matchStr));
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
            	break;

            case 5:
            	try {
                System.out.print("Enter an email: ");
                String email = scanner.nextLine();
                System.out.println("Valid Email: " + RegexUtility.isValidEmail(email));
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
            	break;

            case 6:
            	try {
                System.out.print("Enter number of strings to check (length 1–6): ");
                int count = scanner.nextInt();scanner.nextLine();
                List<String> words = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    System.out.print("Enter string " + (i + 1) + ": ");
                    words.add(scanner.nextLine());
                }
                List<String> filtered = new ArrayList<>();
                for (String str : words) {
                    if (RegexUtility.filterStringsByLength(str)) {
                        filtered.add(str);
                    }
                }
                
               // List<String> filtered = RegexUtility.filterStringsByLength(words);
                System.out.println("Filtered Strings (1–6 chars only): " + filtered);
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
            	break;

            case 7:
            	try {
                System.out.println("Enter 10 strings for List1:");
                List<String> list1 = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    System.out.print("List1[" + i + "]: ");
                    list1.add(scanner.nextLine());
                }

                System.out.println("Enter 3 strings for List2:");
                List<String> list2 = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    System.out.print("List2[" + i + "]: ");
                    list2.add(scanner.nextLine());
                }

                Map<String, Integer> matchMap = new HashMap<>();
                for (String match : list2) {
                    for (int i = 0; i < list1.size(); i++) {
                        if (RegexUtility.isMatchIgnoreCase(list1.get(i), match)) {
                            matchMap.put(match, i);
                            break;
                        }
                    }
                }
                System.out.println("Matching Index Map: " + matchMap);
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
            	break;

            case 8:
            	try {
                System.out.println("Enter raw HTML string:");
                String html = scanner.nextLine();
                List<String> htmlTags = RegexUtility.extractHTMLTags(html);
                System.out.println("HTML Tags:");
                System.out.println(htmlTags);
                
            	} catch (Exception e) {
            		System.out.println("An error occurred: " + e.getMessage());
            	}
                break;

            case 0:
            System.out.println("Exiting...");
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            }
            }while(choice !=0);
            } finally {
            scanner.close();
            }
            }
}
