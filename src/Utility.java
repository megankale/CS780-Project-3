import java.util.Collection;

public class Utility {
	// return -1 if the first string comes first, 1 if the second string comes first, or 0 if two strings are the same.
	public static int compareNums(String s1, String s2) {
		if (s1.equalsIgnoreCase(s2)) {
            return 0;
        } else {
            return s1.compareToIgnoreCase(s2)%2;
        }
	}
	
	public static int compareCurrBalance(Float i, Float j) {
		if (i < j) return -1;
		else if (i > j) return 1;
		else return 0;
	}
	
	public static <T> void printCollection(Collection<T> c) {
        for ( T x: c )
            System.out.println( x );
    }

	public static <T> T extract(Collection<T> c) {
        T x = null;
        for ( T e: c )
            x = e;
        return x;
    }
}
