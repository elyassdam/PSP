
public class ComprobarArgumentos {

	public static void main(String[] args) {
		int longArg=args.length;
		
		switch(longArg) {
		case 0:
			System.exit(1);
			break;
		case 1:
			if(isNumeric(args[0])&& Integer.parseInt(args[0])<0) {
				System.exit(0);
			}else if(isNumeric(args[0])&& Integer.parseInt(args[0])>=0) {
				System.exit(0);
			}else {
				System.exit(2);
			}
			break;
			default:
				System.exit(0);
				break;
		
		}
	}

	public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

}
