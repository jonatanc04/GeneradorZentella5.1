public class Generador {

    public static int[] generarPartido(float local, float visit, boolean activarBuff, int rojaFor) {

        float mediaL, mediaV;

        int[] resultado = new int[2];

        mediaL = local*10;
        mediaV = visit*10;

        int mediaLocal, mediaVisitante;

        mediaLocal = (int)(mediaL);
        mediaVisitante = (int)(mediaV);

        if (rojaFor == 0) {

            mediaLocal = mediaLocal-3;

        } else if (rojaFor == 1) {

            mediaVisitante = mediaVisitante-3;

        }

        if (activarBuff) {

            if (mediaLocal >= mediaVisitante) {
                mediaLocal += 2;
            } else {
                int diferencia = mediaVisitante - mediaLocal;
                mediaLocal += Tool.aumento(diferencia);
            }

        }

        int diferencia;
        int posicion;
        int[] golesL, golesV;

        int cero = 23;
        int uno = 36;
        int dos = 18;
        int tres = 13;
        int cuatro = 9;
        int cinco = 1;
        int seis = 0;
        int siete = 0;
        int ocho = 0;

        if (mediaLocal > mediaVisitante) {

            diferencia = mediaLocal - mediaVisitante;

            if (diferencia == 1) {

                // 51% - 49%

                golesL = Tool.generarArray(cero-1, uno, dos+1, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+1, uno, dos-1, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 2) {

                // 52% - 48%

                golesL = Tool.generarArray(cero-1, uno-1, dos+2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+1, uno+1, dos-2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];


            } else if (diferencia == 3) {

                // 53% - 47%

                golesL = Tool.generarArray(cero-2, uno, dos+2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+2, uno, dos-2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 4) {

                // 54% - 46%

                golesL = Tool.generarArray(cero-2, uno-1, dos+3, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+2, uno+1, dos-3, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 5) {

                // 55% - 45%

                golesL = Tool.generarArray(cero-3, uno-1, dos+3, tres+1, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+3, uno+1, dos-3, tres-1, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 6) {

                // 56% - 44%

                golesL = Tool.generarArray(cero-3, uno-2, dos+3, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+3, uno+2, dos-3, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 7) {

                // 57% - 43%

                golesL = Tool.generarArray(cero-3, uno-3, dos+4, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+3, uno+3, dos-4, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 8) {

                // 58% - 42%

                golesL = Tool.generarArray(cero-3, uno-4, dos+5, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+3, uno+4, dos-5, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 9) {

                // 59% - 41%

                golesL = Tool.generarArray(cero-3, uno-5, dos+5, tres+2, cuatro+1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+3, uno+5, dos-5, tres-2, cuatro-1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 10) {

                // 60% - 40%

                golesL = Tool.generarArray(cero-4, uno-5, dos+5, tres+3, cuatro+1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+4, uno+5, dos-5, tres-3, cuatro-1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 11) {

                // 61% - 39%

                golesL = Tool.generarArray(cero-4, uno-6, dos+5, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+4, uno+6, dos-5, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 12) {

                // 62% - 38%

                golesL = Tool.generarArray(cero-5, uno-6, dos+6, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+5, uno+6, dos-6, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 13) {

                // 63% - 37%

                golesL = Tool.generarArray(cero-5, uno-7, dos+7, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+5, uno+7, dos-7, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 14) {

                // 64% - 36%

                golesL = Tool.generarArray(cero-5, uno-7, dos+6, tres+4, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+5, uno+7, dos-6, tres-4, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 15) {

                // 65% - 35%

                golesL = Tool.generarArray(cero-6, uno-7, dos+6, tres+4, cuatro+2, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+6, uno+7, dos-6, tres-4, cuatro-2, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 16) {

                // 66% - 34%

                golesL = Tool.generarArray(cero-6, uno-8, dos+6, tres+5, cuatro+2, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+6, uno+8, dos-6, tres-5, cuatro-2, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 17) {

                // 67% - 33%

                golesL = Tool.generarArray(cero-6, uno-9, dos+6, tres+5, cuatro+3, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+6, uno+9, dos-6, tres-5, cuatro-3, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 18) {

                // 68% - 32%

                golesL = Tool.generarArray(cero-6, uno-10, dos+6, tres+5, cuatro+4, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+6, uno+10, dos-6, tres-5, cuatro-4, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 19) {

                // 69% - 31%

                golesL = Tool.generarArray(cero-7, uno-10, dos+6, tres+5, cuatro+4, cinco+2, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+7, uno+10, dos-6, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 20) {

                // 70% - 30%

                golesL = Tool.generarArray(cero-7, uno-11, dos+6, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+7, uno+11, dos-7, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 21) {

                // 71% - 29%

                golesL = Tool.generarArray(cero-7, uno-12, dos+7, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+7, uno+12, dos-8, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 22) {

                // 72% - 28%

                golesL = Tool.generarArray(cero-8, uno-12, dos+8, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+8, uno+12, dos-9, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 23) {

                // 73% - 27%

                golesL = Tool.generarArray(cero-8, uno-13, dos+9, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+8, uno+13, dos-10, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 24) {

                // 74% - 26%

                golesL = Tool.generarArray(cero-9, uno-13, dos+9, tres+6, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+9, uno+13, dos-10, tres-6, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 25) {

                // 75% - 25%

                golesL = Tool.generarArray(cero-9, uno-14, dos+9, tres+7, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+9, uno+14, dos-10, tres-7, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 26) {

                // 76% - 24%

                golesL = Tool.generarArray(cero-10, uno-14, dos+9, tres+7, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+10, uno+14, dos-10, tres-7, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 27) {

                // 77% - 23%

                golesL = Tool.generarArray(cero-10, uno-15, dos+10, tres+7, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+10, uno+15, dos-11, tres-7, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 28) {

                // 78% - 22%

                golesL = Tool.generarArray(cero-10, uno-16, dos+10, tres+8, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+10, uno+16, dos-11, tres-8, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 29) {

                // 79% - 21%

                golesL = Tool.generarArray(cero-11, uno-16, dos+10, tres+8, cuatro+5, cinco+3, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+11, uno+16, dos-11, tres-9, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 30) {

                // 80% - 20%

                golesL = Tool.generarArray(cero-11, uno-17, dos+10, tres+8, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+11, uno+17, dos-11, tres-9, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 31) {

                // 81% - 19%

                golesL = Tool.generarArray(cero-12, uno-17, dos+11, tres+8, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+12, uno+17, dos-12, tres-9, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 32) {

                // 82% - 18%

                golesL = Tool.generarArray(cero-12, uno-18, dos+11, tres+9, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+12, uno+18, dos-12, tres-10, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 33) {

                // 83% - 17%

                golesL = Tool.generarArray(cero-13, uno-18, dos+12, tres+9, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+13, uno+18, dos-13, tres-10, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 34) {

                // 84% - 16%

                golesL = Tool.generarArray(cero-13, uno-19, dos+12, tres+10, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+13, uno+19, dos-13, tres-11, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 35) {

                // 85% - 15%

                golesL = Tool.generarArray(cero-14, uno-19, dos+13, tres+10, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+14, uno+19, dos-14, tres-11, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 36) {

                // 86% - 14%

                golesL = Tool.generarArray(cero-14, uno-20, dos+13, tres+10, cuatro+6, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+14, uno+20, dos-14, tres-11, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 37) {

                // 87% - 13%

                golesL = Tool.generarArray(cero-15, uno-20, dos+13, tres+10, cuatro+6, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+15, uno+20, dos-15, tres-11, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 38) {

                // 88% - 12%

                golesL = Tool.generarArray(cero-15, uno-21, dos+13, tres+11, cuatro+6, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+15, uno+21, dos-15, tres-12, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 39) {

                // 89% - 11%

                golesL = Tool.generarArray(cero-16, uno-21, dos+13, tres+11, cuatro+7, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+16, uno+21, dos-15, tres-12, cuatro-9, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia >= 40) {

                // 90% - 10%

                golesL = Tool.generarArray(cero-16, uno-22, dos+13, tres+11, cuatro+7, cinco+3, seis+2, siete+1, ocho+1);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero+16, uno+22, dos-15, tres-13, cuatro-9, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            }

        } else if (mediaLocal < mediaVisitante) {

            diferencia = mediaVisitante - mediaLocal;

            if (diferencia == 1) {

                // 51% - 49%

                golesL = Tool.generarArray(cero+1, uno, dos-1, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-1, uno, dos+1, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 2) {

                // 52% - 48%

                golesL = Tool.generarArray(cero+1, uno+1, dos-2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-1, uno-1, dos+2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];


            } else if (diferencia == 3) {

                // 53% - 47%

                golesL = Tool.generarArray(cero+2, uno, dos-2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-2, uno, dos+2, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 4) {

                // 54% - 46%

                golesL = Tool.generarArray(cero+2, uno+1, dos-3, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-2, uno-1, dos+3, tres, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 5) {

                // 55% - 45%

                golesL = Tool.generarArray(cero+3, uno+1, dos-3, tres-1, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-3, uno-1, dos+3, tres+1, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 6) {

                // 56% - 44%

                golesL = Tool.generarArray(cero+3, uno+2, dos-3, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-3, uno-2, dos+3, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 7) {

                // 57% - 43%

                golesL = Tool.generarArray(cero+3, uno+3, dos-4, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-3, uno-3, dos+4, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 8) {

                // 58% - 42%

                golesL = Tool.generarArray(cero+3, uno+4, dos-5, tres-2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-3, uno-4, dos+5, tres+2, cuatro, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 9) {

                // 59% - 41%

                golesL = Tool.generarArray(cero+3, uno+5, dos-5, tres-2, cuatro-1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-3, uno-5, dos+5, tres+2, cuatro+1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 10) {

                // 60% - 40%

                golesL = Tool.generarArray(cero+4, uno+5, dos-5, tres-3, cuatro-1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-4, uno-5, dos+5, tres+3, cuatro+1, cinco, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 11) {

                // 61% - 39%

                golesL = Tool.generarArray(cero+4, uno+6, dos-5, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-4, uno-6, dos+5, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 12) {

                // 62% - 38%

                golesL = Tool.generarArray(cero+5, uno+6, dos-6, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-5, uno-6, dos+6, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 13) {

                // 63% - 37%

                golesL = Tool.generarArray(cero+5, uno+7, dos-7, tres-3, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-5, uno-7, dos+7, tres+3, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 14) {

                // 64% - 36%

                golesL = Tool.generarArray(cero+5, uno+7, dos-6, tres-4, cuatro-1, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-5, uno-7, dos+6, tres+4, cuatro+1, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 15) {

                // 65% - 35%

                golesL = Tool.generarArray(cero+6, uno+7, dos-6, tres-4, cuatro-2, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-6, uno-7, dos+6, tres+4, cuatro+2, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 16) {

                // 66% - 34%

                golesL = Tool.generarArray(cero+6, uno+8, dos-6, tres-5, cuatro-2, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-6, uno-8, dos+6, tres+5, cuatro+2, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 17) {

                // 67% - 33%

                golesL = Tool.generarArray(cero+6, uno+9, dos-6, tres-5, cuatro-3, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-6, uno-9, dos+6, tres+5, cuatro+3, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 18) {

                // 68% - 32%

                golesL = Tool.generarArray(cero+6, uno+10, dos-6, tres-5, cuatro-4, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-6, uno-10, dos+6, tres+5, cuatro+4, cinco+1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 19) {

                // 69% - 31%

                golesL = Tool.generarArray(cero+7, uno+10, dos-6, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-7, uno-10, dos+6, tres+5, cuatro+4, cinco+2, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 20) {

                // 70% - 30%

                golesL = Tool.generarArray(cero+7, uno+11, dos-7, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-7, uno-11, dos+6, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 21) {

                // 71% - 29%

                golesL = Tool.generarArray(cero+7, uno+12, dos-8, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-7, uno-12, dos+7, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 22) {

                // 72% - 28%

                golesL = Tool.generarArray(cero+8, uno+12, dos-9, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-8, uno-12, dos+8, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 23) {

                // 73% - 27%

                golesL = Tool.generarArray(cero+8, uno+13, dos-10, tres-5, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-8, uno-13, dos+9, tres+5, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 24) {

                // 74% - 26%

                golesL = Tool.generarArray(cero+9, uno+13, dos-10, tres-6, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-9, uno-13, dos+9, tres+6, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 25) {

                // 75% - 25%

                golesL = Tool.generarArray(cero+9, uno+14, dos-10, tres-7, cuatro-5, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-9, uno-14, dos+9, tres+7, cuatro+4, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 26) {

                // 76% - 24%

                golesL = Tool.generarArray(cero+10, uno+14, dos-10, tres-7, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-10, uno-14, dos+9, tres+7, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 27) {

                // 77% - 23%

                golesL = Tool.generarArray(cero+10, uno+15, dos-11, tres-7, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-10, uno-15, dos+10, tres+7, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 28) {

                // 78% - 22%

                golesL = Tool.generarArray(cero+10, uno+16, dos-11, tres-8, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-10, uno-16, dos+10, tres+8, cuatro+5, cinco+2, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 29) {

                // 79% - 21%

                golesL = Tool.generarArray(cero+11, uno+16, dos-11, tres-9, cuatro-6, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-11, uno-16, dos+10, tres+8, cuatro+5, cinco+3, seis+1, siete, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 30) {

                // 80% - 20%

                golesL = Tool.generarArray(cero+11, uno+17, dos-11, tres-9, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-11, uno-17, dos+10, tres+8, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 31) {

                // 81% - 19%

                golesL = Tool.generarArray(cero+12, uno+17, dos-12, tres-9, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-12, uno-17, dos+11, tres+8, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 32) {

                // 82% - 18%

                golesL = Tool.generarArray(cero+12, uno+18, dos-12, tres-10, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-12, uno-18, dos+11, tres+9, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 33) {

                // 83% - 17%

                golesL = Tool.generarArray(cero+13, uno+18, dos-13, tres-10, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-13, uno-18, dos+12, tres+9, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 34) {

                // 84% - 16%

                golesL = Tool.generarArray(cero+13, uno+19, dos-13, tres-11, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-13, uno-19, dos+12, tres+10, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 35) {

                // 85% - 15%

                golesL = Tool.generarArray(cero+14, uno+19, dos-14, tres-11, cuatro-7, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-14, uno-19, dos+13, tres+10, cuatro+5, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 36) {

                // 86% - 14%

                golesL = Tool.generarArray(cero+14, uno+20, dos-14, tres-11, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-14, uno-20, dos+13, tres+10, cuatro+6, cinco+3, seis+1, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 37) {

                // 87% - 13%

                golesL = Tool.generarArray(cero+15, uno+20, dos-15, tres-11, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-15, uno-20, dos+13, tres+10, cuatro+6, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 38) {

                // 88% - 12%

                golesL = Tool.generarArray(cero+15, uno+21, dos-15, tres-12, cuatro-8, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-15, uno-21, dos+13, tres+11, cuatro+6, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia == 39) {

                // 89% - 11%

                golesL = Tool.generarArray(cero+16, uno+21, dos-15, tres-12, cuatro-9, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-16, uno-21, dos+13, tres+11, cuatro+7, cinco+3, seis+2, siete+1, ocho);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            } else if (diferencia >= 40) {

                // 90% - 10%

                golesL = Tool.generarArray(cero+16, uno+22, dos-15, tres-13, cuatro-9, cinco-1, seis, siete, ocho);
                posicion = (int) (Math.random() * (golesL.length));
                resultado[0] = golesL[posicion];

                golesV = Tool.generarArray(cero-16, uno-22, dos+13, tres+11, cuatro+7, cinco+3, seis+2, siete+1, ocho+1);
                posicion = (int) (Math.random() * (golesV.length));
                resultado[1] = golesV[posicion];

            }

        } else {

            // 50% - 50%

            golesL = Tool.generarArray(cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho);
            posicion = (int) (Math.random() * (golesL.length));
            resultado[0] = golesL[posicion];

            golesV = Tool.generarArray(cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho);
            posicion = (int) (Math.random() * (golesV.length));
            resultado[1] = golesV[posicion];

        }

        return resultado;

    }

}