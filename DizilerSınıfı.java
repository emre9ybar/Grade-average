

import java.util.Scanner;

public class DizilerSınıfı {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String[] students={"Mehmet","Emre"};
        String[] subject ={"jimsnatik","Psikoloji"};
        int[][] grades =new int[students.length][subject.length];

        System.out.println("\nPuan hesaplama Sistemi\n ");

        for (int i = 0;i< students.length;i++){
            for (int j= 0;j< subject.length;j++ ){
                System.out.print(students[i]+" için "+subject[j]+" notunu giriniz :");
                    grades[i][j]=scan.nextInt();
            }        System.out.println("\nDönem Sonu not ortalamaları \n");}

        for (int i = 0;i< students.length;i++){
            int total=0;
            for (int j = 0;j< subject.length;j++){
                total+=grades[i][j];
            }double totalavarage=(double) total / subject.length;
            System.out.println(students[i]+" için sınıf not ortalamsı :"+totalavarage);
        }

        System.out.println("\nDers için sınıf ortalaması :\n");

        for (int i=0; i< subject.length; i++){
            int sum=0;
            for (int j = 0; j<students.length; j++){
                sum+=grades[j][i];

            }double totallesson=(double)sum/students.length;
            System.out.println(subject[i]+ " için sınıf ortalaması :"+totallesson);

        }}}






















