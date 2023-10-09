import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tool {

    public static float recogerMedia() {

        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();

    }

    public static int[] shuffle (int[] arr) {
        Random random = new Random();
        int n = arr.length;
        int[] shuffledArr = Arrays.copyOf(arr, n);
        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(n - i) + i;
            int temp = shuffledArr[i];
            shuffledArr[i] = shuffledArr[randomIndex];
            shuffledArr[randomIndex] = temp;
        }
        return shuffledArr;
    }

    public static int aumento (int diferencia) {

        int aumento;

        if (diferencia >= 0 && diferencia < 18) {
            aumento = 2;
        } else if (diferencia >= 18 && diferencia < 27) {
            aumento = 3;
        } else if (diferencia >= 27 && diferencia < 36) {
            aumento = 4;
        } else {
            aumento = 5;
        }

        return aumento;

    }

    public static int[] ruletaAmarillas() {

        int[] resultado = new int[3];
        int amarillaPara;
        int local = 0;
        int visitante = 0;

        int[] amarillas = new int[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 ,1,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 ,2 ,2 ,2, 2, 2, 2, 2 ,2 ,2, 2, 2, 2, 2, 2, 2,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                5, 5, 5, 5,
                6
        };

        amarillas = shuffle(amarillas);

        int num = (int) (Math.random() * amarillas.length);

        // Amarillas totales
        resultado[0] = amarillas[num];

        for (int i = 1; i <= resultado[0]; i++) {

            amarillaPara = (int) Math.round(Math.random());

            if (amarillaPara == 0) {
                local++;
            } else {
                visitante++;
            }

        }

        resultado[1] = local;
        resultado[2] = visitante;

        return resultado;

    }

    public static int ruletaRojas() {

        int[] numeros = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
        numeros = shuffle(numeros);

        int hayRojaDirecta = (int) (Math.random() * (10 - 1));
        return numeros[hayRojaDirecta];

    }

    public static int asignarRoja() {

        int[] numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 ,1 ,2, 2};
        numeros = shuffle(numeros);

        int rojaPara = (int) (Math.random() * (20 - 1));
        return numeros[rojaPara];

    }

    public static int ruletaLesiones() {

        int[] numeros = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        numeros = shuffle(numeros);

        int hayRojaDirecta = (int) (Math.random() * (11 - 1));
        return numeros[hayRojaDirecta];

    }

    public static String asignarLesiones(int[] amarillas, int rojaFor) {

        int[] numeros;
        String[] tipos = new String[]{"en Local ", "en Visitante ", "en ambos "};
        String lesionFinal = "";
        int tipoLesion;

        /**
         * Amarillas[0] = Amarillas totales
         * Amarillas[1] = Amarillas local
         * Amarillas[2] = Amarillas visitante
         * rojaFor = 0 - > Local
         * rojaFor = 1 - > Visitante
         * rojaFor = 2 - > Ambos
         */

        if (
                (amarillas[1] > 0 && amarillas[2]>0) ||
                (amarillas[1] > 0 && rojaFor == 1) ||
                (amarillas[2] > 0 && rojaFor == 0) ||
                rojaFor == 2

        ) {
            numeros = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2};
        } else {
            numeros = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        }
        numeros = shuffle(numeros);
        tipoLesion = (int) (Math.random() * (20 - 1));

        if (rojaFor == 2) {
            lesionFinal = tipos[numeros[tipoLesion]];
        }

        if (numeros[tipoLesion] == 2) {
            lesionFinal = tipos[numeros[tipoLesion]];
        }

        if (numeros[tipoLesion] == 0) {
            if (amarillas[2] > 0 || rojaFor == 1) {
                lesionFinal = tipos[0];
            } else {
                if (amarillas[1] > 0 || rojaFor == 0) {
                    lesionFinal = tipos[1];
                }
            }
        }

        if (numeros[tipoLesion] == 1) {
            if (amarillas[1] > 0 || rojaFor == 0) {
                lesionFinal = tipos[1];
            } else {
                if (amarillas[2] > 0 || rojaFor == 1) {
                    lesionFinal = tipos[0];
                }
            }
        }

        lesionFinal = tiempoLesion(lesionFinal);

        return lesionFinal;

    }

    public static String tiempoLesion (String lesionPara) {

        String lesion = lesionPara;

        int unPartido = 60;
        int dosPartidos = 35;
        int tresPartidos = 5;

        int[] prob = generarArray(unPartido,dosPartidos,tresPartidos,0,0,0,0,0,0);

        int tiempo = (int) (Math.random() * prob.length-1);

        if (lesion.equalsIgnoreCase("en ambos ")) {

            if (prob[tiempo] == 0) {
                lesion += "1 p.";
            } else if (prob[tiempo] == 1) {
                lesion += "2 p.";
            } else {
                lesion += "3 p.";
            }

            tiempo = (int) (Math.random() * prob.length-1);

            if (prob[tiempo] == 0) {
                lesion += " y 1 p.";
            } else if (prob[tiempo] == 1) {
                lesion += " y 2 p.";
            } else {
                lesion += " y 3 p.";
            }

        } else {
            if (prob[tiempo] == 0) {
                lesion += "1 p.";
            } else if (prob[tiempo] == 1) {
                lesion += "2 p.";
            } else {
                lesion += "3 p.";
            }
        }

        return lesion;

    }



    public static String[] ruletaJugadores() {

        String[] result = new String[3];
        int[] array;

        int ejecutor;
        int delantero = 55;
        int medio = 31;
        int defensa = 14;
        int portero = 0;

        int normal = 59;
        int falta = 16;
        int penal = 10;
        int corner = 14;
        int autogol = 1;

        array = Tool.generarArray(normal, falta, penal, corner, autogol, 0, 0, 0,0);
        array = shuffle(array);

        ejecutor = (int) (Math.random() * (array.length));

        switch (array[ejecutor]) {
            case 0:
                result[1] = "Normal";
                break;
            case 1:
                result[1] = "Falta";
                break;
            case 2:
                result[1] = "Penal";
                break;
            case 3:
                result[1] = "Corner";
                break;
            case 4:
                result[1] = "Autogol";
        }

        if (!result[1].equalsIgnoreCase("normal")) {
            delantero--;
            portero++;
        }

        if (result[1].equalsIgnoreCase("falta")) {
            delantero -= 15;
            medio += 10;
            defensa += 5;
        }

        if (result[1].equalsIgnoreCase("corner")) {
            delantero -= 10;
            medio -= 10;
            defensa += 20;
        }

        array = Tool.generarArray(delantero, medio, defensa, portero, 0, 0, 0, 0, 0);
        array = shuffle(array);

        ejecutor = (int) (Math.random() * (array.length));

        switch (array[ejecutor]) {
            case 0:
                result[0] = "Delantero";
                break;
            case 1:
                result[0] = "Mediocentro";
                break;
            case 2:
                result[0] = "Defensa";
                break;
            case 3:
                result[0] = "Portero";
                break;
        }

        if (result[1].equalsIgnoreCase("autogol")) {
            result[0] = "---";
        }

        result[2] = ruletaAsistencias(result[1]);

        return result;

    }

    public static String ruletaAsistencias(String type) {

        int delantero = 27;
        int medio = 50;
        int defensa = 17;
        int portero = 6;

        if (type.equalsIgnoreCase("corner")) {
            portero = 0;
            medio = 56;
        }

        String result = "";
        int[] array;

        int ejecutor;

        array = Tool.generarArray(delantero, medio, defensa, portero, 0, 0, 0, 0, 0);
        array = shuffle(array);

        ejecutor = (int) (Math.random() * (array.length));

        switch (array[ejecutor]) {
            case 0:
                result = "Delantero";
                break;
            case 1:
                result = "Mediocentro";
                break;
            case 2:
                result = "Defensa";
                break;
            case 3:
                result = "Portero";
                break;
        }

        return result;

    }

    public static String asignarAmarillas () {

        int portero = 15;
        int defensa = 35;
        int medio = 30;
        int delantero = 20;

        int[] array = generarArray(portero, defensa,medio,delantero,0,0,0,0,0);
        int asignado = (int) (Math.random() * (array.length));
        String aux = "";

        switch (array[asignado]) {
            case 0:
                aux = "Portero";
                break;
            case 1:
                aux = "Defensa";
                break;
            case 2:
                aux = "Mediocentro";
                break;
            case 3:
                aux = "Delantero";
                break;
        }

        return aux;

    }


    public static int numeroAleatorio(int max) {
        return (int) (Math.random() * max+1);
    }

    public static int[] generarArray(int cero, int uno, int dos, int tres, int cuatro, int cinco, int seis, int siete, int ocho) {

        int[] goles = new int[100];

        int inicio = 0;
        int tope = cero;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 0;
        }

        inicio = tope;
        tope = tope + uno;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 1;
        }

        inicio = tope;
        tope = tope + dos;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 2;
        }

        inicio = tope;
        tope = tope + tres;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 3;
        }

        inicio = tope;
        tope = tope + cuatro;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 4;
        }

        inicio = tope;
        tope = tope + cinco;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 5;
        }

        inicio = tope;
        tope = tope + seis;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 6;
        }

        inicio = tope;
        tope = tope + siete;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 7;
        }

        inicio = tope;
        tope = tope + ocho;

        for (int i = inicio; i < tope; i++) {
            goles[i] = 8;
        }

        return goles;

    }

}
