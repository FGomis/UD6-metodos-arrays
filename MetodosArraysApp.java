import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.util.Random;
public class MetodosArraysApp {

	public static void main(String[] args) {
//		metodoTarea1();
//		metodoTarea2();
//		metodoTarea3();
//		metodoTarea4();
//		metodoTarea5();
//		metodoTarea6();
//		metodoTarea7();
//		metodoTarea8();
//		metodoTarea9();
//		metodoTarea9v2();
//		metodoTarea10();
//		metodoTarea11();
//		metodoTarea12();
	}
	
	//**** TAREA 1 ****
	//M�todo principal
		public static void metodoTarea1() {
			String figura = JOptionPane.showInputDialog("Introduce de que figura quieres calcular el �rea");
			
			switch (figura) {
			case "triangulo":
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
				JOptionPane.showMessageDialog(null, "El �rea del triangulo es "+areaTriangulo(base, altura));
				break;
				
			case "cuadrado":
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del lado del cuadrado"));
				JOptionPane.showMessageDialog(null, "El �rea del cuadrado es "+areaCuadrado(lado));
				break;
				
			case "circulo":
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del c�rculo"));
				JOptionPane.showMessageDialog(null, "El �rea del cuadrado es "+areaCirculo(radio));
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "No has introducido una figura v�lida");
				break;
			}
		}
	
	//M�todo para calcular el �rea del c�rculo
		public static double areaCirculo (int radio) {
			double area = Math.PI * Math.pow(radio, 2);
			return area;
		}
	
	//M�todo para calcular el �rea del triangulo
		public static int areaTriangulo (int base, int altura) {
			int area = (base*altura)/2;
			return area;
		}
	
	//M�todo para calcular el �rea del cuadrado
		public static int areaCuadrado (int lado) {
			int area = lado*lado;	
			return area;
		}
	
	//**** TAREA 2 ****
	//M�todo principal
		public static void metodoTarea2() {
			int cantNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos n�meros aleatorios quieres generar"));
			int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero m�nimo a generar"));
			int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero m�ximo a generar"));
			for (int i = 0; i < cantNum; i++) {
				JOptionPane.showMessageDialog(null, generarRandom(min, max));
			}	
		}
		
	//M�todo para generar un n�mero aleatorio en el rango de los p�rametros pasados
		public static int generarRandom( int min, int max) {
			int n = (int)(Math.random()*(max-min+1)+min);
			return n;
		}
		
	//**** TAREA 3 ****
	//M�todo principal
		public static void metodoTarea3() {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			boolean primo = esPrimo(num);
			if(primo) {
				JOptionPane.showMessageDialog(null, "El n�mero es primo");
			} else {
				JOptionPane.showMessageDialog(null, "El n�mero no es primo");
			}
		}
		
	//M�todo para calcular si un n�mero es primo
		public static boolean esPrimo(int num) {
			boolean primo = true;
			if(num == 0 || num == 1) {
				primo = false;
			} else {
				for (int i = 2; i <= num/2; i++) {
					if(num%i==0) {
						primo = false;
					}
				}
			}
			return primo;
		}
		
	//**** TAREA 4 ****
	//M�todo principal
		public static void metodoTarea4() {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+factorial(num));
		}
		
	//M�todo para calcular el factorial
		public static int factorial(int num) {
			int r = 1;
			for (int i = num; i >= 1; i--) {
				r *= i;
			}
			return r;
		}
		
	//**** TAREA 5 ****
	//M�todo principal
		public static void metodoTarea5() {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			JOptionPane.showMessageDialog(null, "El el n�mero "+num+" en binario es "+convBinario(num));
		}
		
		public static String convBinario(int num) {
			String n = "";
			for (int i = num; i > 0 ; i=i/2) {
				n = i%2 + n;
			}
			return n;
		}
		
	//**** TAREA 6 ****
	//M�todo principal
		public static void metodoTarea6() {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero positivo"));
			if(num > 0) {
				JOptionPane.showMessageDialog(null, "El el n�mero "+num+" tiene "+contCifras(num)+" cifras");
			} else {
				JOptionPane.showMessageDialog(null, "El n�mero introducido no es positivo");
			}
			
		}
		
	//M�otdo para contar cuantas c�fras tiene un n�mero, lo pasamos a string y devolvemos el valor del length del string
		public static int contCifras(int num) {
			return String.valueOf(num).length();
		}
		
	//**** TAREA 7 ****
	//M�todo principal
		public static void metodoTarea7() {
			int euros = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de euros a convertir"));
			String divisa = JOptionPane.showInputDialog("Introduce la divisa para la conversi�n (libra, dolar, yen)");
			convDivisas(euros,divisa);		
		}
		
	//M�todo para la conversi�n de divisas
		public static void convDivisas(int euros, String divisa) {
			switch (divisa) {
			case "libra":
				JOptionPane.showMessageDialog(null, euros+"� equivalen a "+(euros*0.86)+(" libras"));
				break;
				
			case "dolar":
				JOptionPane.showMessageDialog(null, euros+"� equivalen a "+(euros*1.28611)+(" d�lares"));
				break;
				
			case "yen":
				JOptionPane.showMessageDialog(null, euros+"� equivalen a "+(euros*129.852)+(" yenes"));
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "No has introducido una divisa v�lida");
				break;
			}
		}
		
	//**** TAREA 8 ****
	//M�todo principal
		public static void metodoTarea8() {
			int numeros[] = new int[10];
			llenarArray(numeros);
			mostrarArray(numeros);
		}
		
	//M�todo para general el array
		public static void llenarArray(int[]num) {
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero "+(i+1)+" del array"));
			}
		}
		
	//M�todo para mostrar el array por consola
		public static void mostrarArray(int[]num) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}
		}
		
	//**** TAREA 9 ****
	//M�todo principal
		public static void metodoTarea9() {
			int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del array"));
			int numeros[] = new int[tama�o];
			String output = "";
			int suma = 0;
			Random rndm = new Random();

			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = rndm.nextInt(10);
				suma += numeros[i];
				output += numeros[i] + " ";
			}
			JOptionPane.showMessageDialog(null, output+"\nLa suma de todos los valores del array es "+suma);
		}
		
	//M�todo para la segunda parte del ejerc�cio
		public static void metodoTarea9v2() {
			int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del array"));
			int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero m�nimo a generar para los valores del array"));
			int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero m�ximo a generar para los valores del array"))+1;
			int numeros[] = new int[tama�o];
			llenarArrayRandom(numeros, min, max);
			mostrarArrayRandom(numeros);
		}
		
	//M�todo para llenar el array de n�meros aleatorios
		public static void llenarArrayRandom(int[] numeros, int min, int max) {
			Random rndm = new Random();
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = rndm.nextInt(max - min)+min;
			}
		}
		
	//M�todo para mostrar el array y la suma
		public static void mostrarArrayRandom(int[] numeros) {
			String output = "";
			int suma = 0;
			for (int i = 0; i < numeros.length; i++) {
				suma += numeros[i];
				output += numeros[i] + " ";
			}
			JOptionPane.showMessageDialog(null, output+"\nLa suma de todos los valores del array es "+suma);
		}
		
	//**** TAREA 10 ****
	//M�todo principal
		public static void metodoTarea10() {
			int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del array"));
			int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero m�nimo a generar para los valores del array"));
			int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�mero m�ximo a generar para los valores del array"))+1;
			int numeros[] = new int[tama�o];
			llenarArrayPrimos(numeros, min, max);
			mostrarArrayPrimos(numeros);
		}
		
	//M�todo para llenar el array de n�meros primos aleatorios
		public static void llenarArrayPrimos(int[]numeros, int min, int max) {
			Random rndm = new Random();
			int n = 0;
			int num = 0;
			boolean primo;
			
			//Generamos un n�mero aleatorio y comprobamos si es primo y si lo es lo a�adimos al array, as� hasta rellenar el array
			while(n<numeros.length) {
				primo = true;
				num = rndm.nextInt(max - min)+min;

				if(num == 0 || num == 1) {
					primo = false;
				} else {
					for (int i = 2; i <= num/2; i++) {
						if(num%i==0) {
							primo = false;
						}
					}
				}
				
				if(primo==true) {
					numeros[n]=num;
					n++;
				}
			}
		}
		
	//M�todo para mostrar el array por pantalla
		public static void mostrarArrayPrimos(int[] numeros) {
			String output = "";
			int mayor = 0;
			
			for (int i = 0; i < numeros.length; i++) {
				output += numeros[i] + " ";
				if(numeros[i]>mayor) {
					mayor = numeros[i];
				}
			}
			JOptionPane.showMessageDialog(null, "El array de n�meros primos generado es el siguiente:\n"+output+"\nEl valor m�s alto es "+mayor);
		}
		
	//**** TAREA 11 ****
	//M�todo principal
		public static void metodoTarea11() {
			int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del array"));
			int array1[] = new int[tama�o];
			int array2[] = array1;
			array2 = new int[tama�o];
			String output = "Array 1\t\tArray 2\t\tResultado\n";
			
			llenarArrays(array1, array2);
			int mult[] = multiplicarArrays(array1, array2);
			
			for (int i = 0; i < mult.length; i++) {
				output += array1[i]+"\t*\t"+array2[i]+"\t=\t"+mult[i]+"\n";
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(output));
		}
		
	//M�todo para rellenar ambas arrays de n�meros aleatorios
		public static void llenarArrays(int[] array1, int[] array2) {
			Random rndm = new Random();
			for (int i = 0; i < array1.length; i++) {
				array1[i] = rndm.nextInt(26);
			}
			for (int i = 0; i < array2.length; i++) {
				array2[i] = rndm.nextInt(12);
			}
		}
		
	//M�todo para rellenar una tercera array con los productos de las dos primeras
		public static int[] multiplicarArrays(int[] array1, int[]array2) {
			int mult[] = new int[array1.length];
			for (int i = 0; i < array1.length; i++) {
				mult[i] = array1[i] * array2[i];
			}
			return mult;
		}
		
	//**** TAREA 12 ****
	//M�todo principal
		public static void metodoTarea12() {
			String num = JOptionPane.showInputDialog("Introduce el tama�o del array");
			String numFinal = JOptionPane.showInputDialog("Introduce el n�mero final a comprobar");
			boolean esNum = true;
			
			//Comprobamos que se pueda parsear a un n�mero entero el string con el que hemos recogido el n�mero final,
			//si no es el caso no es un n�mero v�lido por lo que lanzamos mensaje de error y el programa termina.
			try {
				Integer.parseInt(numFinal);
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El n�mero introducido no es v�lido");
				esNum = false;
			}
			
			if(esNum) {
				int tama�o = Integer.parseInt(num);
				int ultNum = Integer.parseInt(numFinal);
				int numeros[] = new int[tama�o];
				Random rndm = new Random();
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = rndm.nextInt(300)+1;
				}
				
				mostrarArrayNumFinal(numeros, ultNum);
			}
			
		}
		
		public static void mostrarArrayNumFinal(int[]numeros, int ultNum) {
			int tama�o = 0;
			int j = 0;
			String outputArray1 = "Array original\t";
			String outputArray2 = "\nArray final\t";
			String outputFinal = "\nN�mero final \t"+ultNum;
			
			
			for (int i = 0; i < numeros.length; i++) {
				outputArray1 += "  "+numeros[i];
				if(numeros[i]%10==ultNum) {
					tama�o++;
				}
			}
			
			int arrayFinal[] = new int[tama�o];
			
			for (int i = 0; i < numeros.length; i++) {
				if(numeros[i]%10==ultNum) {
					arrayFinal[j]=numeros[i];
					outputArray2 += "  "+arrayFinal[j];
					j++;
				}
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(outputArray1+outputArray2+outputFinal));
		}
}
