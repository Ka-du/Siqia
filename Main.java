import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas tamperaturas serao transformadas: ");
        int qtdTemperatura = sc.nextInt();
        System.out.println("Informe a unidade de origem: 1 -Celsius 2-Fahrenheit 3-Kelvin: ");
        int unidadeMedida = sc.nextInt();
        System.out.println("Informe a unidade para ser transformada: 1- Celsius 2-Farenheit 3-Kelvin: ");
        int unidadeTransformada = sc.nextInt();

        float [] temperaturas = new float[qtdTemperatura];
        float [] temperaturasTransformadas = new float[qtdTemperatura];
        for (int i= 0; i<qtdTemperatura; i++){
            System.out.printf("Digite a %d temperatura: ", i+1);
            temperaturas[i]=sc.nextFloat();
        }

        if(unidadeMedida == 1 && unidadeTransformada == 2){
            for (int j = 0; j<temperaturas.length; j++){
                temperaturasTransformadas[j]= ((temperaturas[j]*1.8F)+32);
            }
        }else if(unidadeMedida == 1 && unidadeTransformada == 3){
            for (int k = 0; k<temperaturas.length; k++){
                temperaturasTransformadas[k]=temperaturas[k]+273.15F;
            }
        }else if(unidadeMedida == 2 && unidadeTransformada == 1){
            for (int l = 0; l<temperaturas.length; l++) {
                temperaturasTransformadas[l] = (temperaturas[l] - 32)/1.8F;
            }

        }else if(unidadeMedida == 2 && unidadeTransformada == 3){
        for (int i = 0; i<temperaturas.length; i++){
            temperaturasTransformadas[i]=((temperaturas[i]-32)*5/9)+273.15F;
            }

        }else if(unidadeMedida == 3 && unidadeTransformada == 1){
        for (int j = 0; j<temperaturas.length; j++){
            temperaturasTransformadas[j]=(temperaturas[j]-273.15F);
            }

        }else if(unidadeMedida == 3 && unidadeTransformada == 2){
        for (int k = 0; k<temperaturas.length; k++){
            temperaturasTransformadas[k]=(((temperaturas[k]-273.15F)*1.8F)+32);
            }
        }

        printTemperaturas (temperaturas,temperaturasTransformadas,unidadeMedida,unidadeTransformada);
        media(temperaturas,temperaturasTransformadas);





    }














    public static void printTemperaturas (float[]temperaturas, float []temperaturasTransformadas,int unidadeMedida,int unidadeTransformada){
        switch (unidadeMedida){
            case 1:
                if (unidadeTransformada == 2){
                    for (int i= 0; i<temperaturas.length;i++){
                        System.out.printf("\n%.2f C ", temperaturas[i]);
                        System.out.printf(" equivale a %.2f F", temperaturasTransformadas[i]);
                    }
                }else if(unidadeTransformada == 3){
                    for (int i= 0; i<temperaturas.length;i++){
                        System.out.printf("\n%.2f C ", temperaturas[i]);
                        System.out.printf(" equivale a %.2f K", temperaturasTransformadas[i]);
                    }
                }
            break;

            case 2:
                if (unidadeTransformada == 1){
                    for (int i= 0; i<temperaturas.length;i++){
                        System.out.printf("\n%.2f F ", temperaturas[i]);
                        System.out.printf(" equivale a %.2f C", temperaturasTransformadas[i]);
                    }
                }else if(unidadeTransformada == 3){
                    for (int i= 0; i<temperaturas.length;i++){
                        System.out.printf("\n%.2f F ", temperaturas[i]);
                        System.out.printf(" equivale a %.2f K", temperaturasTransformadas[i]);
                    }
                }
                break;

            case 3:
                if (unidadeTransformada == 1){
                    for (int i= 0; i<temperaturas.length;i++){
                        System.out.printf("\n%.2f K ", temperaturas[i]);
                        System.out.printf(" equivale a %.2f C", temperaturasTransformadas[i]);
                    }
                }else if(unidadeTransformada == 2){
                    for (int j= 0; j<temperaturas.length;j++){
                        System.out.printf("\n%.2f K ", temperaturas[j]);
                        System.out.printf(" equivale a %.2f F", temperaturasTransformadas[j]);
                    }
                }
                break;
        }
    }


    public static void media(float[]temperaturas, float[]temperaturasTransformadas){
        float media = 0;
        float soma=0;
        for (int i = 0; i<temperaturas.length;i++ ){
            soma += temperaturas[i];
        }
        media = soma/temperaturas.length;
        System.out.printf("\nA media das temperaturas antes da conversao: %.2f",media);

        float media2 = 0;
        float soma2=0;
        for (int i = 0; i<temperaturasTransformadas.length;i++ ){
            soma2 += temperaturasTransformadas[i];
        }
        media2 = soma2/ temperaturasTransformadas.length;
        System.out.printf("\nA media das temperaturas transformadas : %.2f",media2);
    }



}

