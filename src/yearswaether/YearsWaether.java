/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearswaether;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class YearsWaether {

    public static enum month {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август,
        Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    
    public static void main(String[] args) {
        int[][] yearsWaether = new int [12][];
        System.out.print("\t");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%5d",i+1);
        }
        System.out.println();
        for (int i = 0; i < 200; i++) {
            System.out.print("-");
        }
        System.out.println("");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int min = -20, max = 20, dayInMonth = 0, a=0;
        for (int i = 0; i < yearsWaether.length; i++) {
            switch (i) {
                case 0: min = -20; max = -5; dayInMonth = 31; break;
                case 1: min = -15; max = 0; dayInMonth = 28; break;
                case 2: min = -10; max = 5; dayInMonth = 31; break;
                case 3: min = -5; max = 10; dayInMonth = 30; break;
                case 4: min = 0; max = 15; dayInMonth = 31; break;
                case 5: min = 10; max = 20; dayInMonth = 30; break;
                case 6: min = 15; max = 25; dayInMonth = 31; break;
                case 7: min = 10; max = 20; dayInMonth = 31; break;
                case 8: min = 5; max = 15; dayInMonth = 30; break;
                case 9: min = -5; max = 10; dayInMonth = 31; break;
                case 10: min = -10; max = 5; dayInMonth = 30; break;
                case 11: min = -15; max = 0; dayInMonth = 31; break;
            }
            yearsWaether[i] = new int [dayInMonth];
            System.out.printf("%9s", month.values()[i]+":");
            float sum = 0;
            for (int j = 0; j < yearsWaether[i].length; j++) {
                yearsWaether[i][j] = random.nextInt(max - min + 1)+min;
                System.out.printf("%5d", yearsWaether[i][j]);
                sum += yearsWaether[i][j];
            }
            
            sum /= dayInMonth;
            switch (dayInMonth) {
                case 31:
                    System.out.printf(" |средняя температура за месяц = "+ sum);
                    break;
                case 30:
                    System.out.printf("      |средняя температура за месяц = "+ sum);
                    break;
                case 28:
                    System.out.printf("                |средняя температура за месяц = "+ sum);
                    break;
                default:
                    break;
            }
            
            System.out.println("");
            a+=1;
            if(12==a){
                for (int j = 0; j < 200; j++) {
                    System.out.print("-");
                }
                System.out.println("");
                System.out.print("Введите месяц: ");
                int userMonth = scanner.nextInt();
                System.out.print("Введите день месяца температуру которо вы хотите узнать(1..31): ");
                int userDay = scanner.nextInt()-1;
                for (int j = 0; j < yearsWaether.length; j++) {
                    switch (j) {
                        case 0: min = -20; max = -5; dayInMonth = 31; break;
                        case 1: min = -15; max = 0; dayInMonth = 28; break;
                        case 2: min = -10; max = 5; dayInMonth = 31; break;
                        case 3: min = -5; max = 10; dayInMonth = 30; break;
                        case 4: min = 0; max = 15; dayInMonth = 31; break;
                        case 5: min = 10; max = 20; dayInMonth = 30; break;
                        case 6: min = 15; max = 25; dayInMonth = 31; break;
                        case 7: min = 10; max = 20; dayInMonth = 31; break;
                        case 8: min = 5; max = 15; dayInMonth = 30; break;
                        case 9: min = -5; max = 10; dayInMonth = 31; break;
                        case 10: min = -10; max = 5; dayInMonth = 30; break;
                        case 11: min = -15; max = 0; dayInMonth = 31; break;
                    }
                }
                
                
            }
            else{
            }
        }
    }
    
}
