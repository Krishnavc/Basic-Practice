
public enum PLtypes {
	highlevel, machinelevel, assembly, middlelevel
}
public class Enum {
	public static void main(String args[]) {
        PLtypes lang;
        System.out.println(" Here are lists of constants");
        PLtypes alltypes[] = PLtypes.values();
        for (PLtypes a: alltypes)
            System.out.println(a);
        System.out.println();
        lang = PLtypes.valueOf("assembly");
        System.out.println("Value is:" + lang);
	}
}
