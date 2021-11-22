package com.tw.practice.exceptionhandling;

import java.util.Scanner;


public class ExceptionHandler {

    static void solve(int[] inputArray) throws Exception
    {
        int answer=0;

        for(int i=0;i<10;i++)
            for(int j=i+1;j<10;j++)
                answer+=inputArray[i]/inputArray[j];

        throw new MyException(answer);
    }

    public static void main(String[] args) {
        try
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int []arr= new int[n];
            in.nextLine();

            for(int i=0;i<10;i++)
                arr[i]=Integer.parseInt(in.nextLine());

            String s=in.nextLine();
            System.out.println(s.charAt(10));

            solve(arr);
        }
        catch(ArithmeticException exception) {
            System.out.println("Invalid division");
        }
        catch(NumberFormatException exception){
            System.out.println("Format mismatch");
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Index is invalid");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index is invalid");
        }
        catch (MyException exception){
            System.out.println("MyException["+exception.getMessage()+"]~");
        }
        catch (Exception exception){
            System.out.println("Exception encountered");
        }
        System.out.println("Exception handling completed.");
    }
}
