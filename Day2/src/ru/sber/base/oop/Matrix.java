package ru.sber.base.oop;

public class Matrix {
    double[][] data;
    int rows;
    int cols;

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public void setValue(int i, int j, int value){
        data[i][j] = value;
    }

    public Matrix add(Matrix other) {
        if(this.rows != other.rows || this.cols != other.cols){
            System.out.println("Сложение невозможно");
            return null;
        }

        Matrix result = new Matrix(rows, cols);

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
    public Matrix multiplyByNum(double number){
        Matrix result = new Matrix(rows, cols);

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                result.data[i][j] = this.data[i][j] * number;
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other){
        if(this.cols != other.rows){
            System.out.println("Умножение невозможно: число столбцов первой матрицы не равно числу строк второй");
        return null;
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                for(int k = 0; k < this.cols; ++k){
                result.data[i][j] = this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}