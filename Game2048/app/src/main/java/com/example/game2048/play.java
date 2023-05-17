package com.example.game2048;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.game2048.Constant.*;

import android.os.Bundle;
import android.widget.ImageButton;

public class play extends AppCompatActivity {
    private ImageButton exit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    exit = findViewById(R.id.imageButton2);
    exit.setOnClickListener(v -> setContentView(R.layout.activity_main)
            );
    }
    /**
     * Состояние всех ячеек поля.
     */
    private int[][] play;

    /**
     * Инициализирует поле и заполняет его нулями
     */
    public void play(){
        play= new int[COUNT_CELLS_X][COUNT_CELLS_Y];

        for(int i=0; i<play.length;i++){
            for(int j=0; j<play[i].length; j++){
                play[i][j]=0;
            }
        }
    }

    /**
     * Возвращает состояние ячейки поля по координатам
     *
     * @param x Координата ячейки X
     * @param y Координата ячейки Y
     * @return Состояние выбранной ячейки
     */
    public int getState(int x, int y){
        return play[x][y];
    }

    /**
     * Изменяет состояние ячейки поля по координатам
     *
     * @param x Координата ячейки X
     * @param y Координата ячейки Y
     * @param state Новое состояние для этой ячейки
     */
    public void setState(int x, int y, int state){
        //TODO check input maybe?

        play[x][y] = state;
    }

    /**
     * Изменяет столбец под номером i
     *
     * @param i Номер изменяемого столбца
     * @param newColumn Массив новых состояний ячеек столбца
     */
    public void setColumn(int i, int[] newColumn) {
        play[i] = newColumn;
    }

    /**
     * Возвращает массив состояний ячеек столбца под номером i
     *
     * @param i Номер запрашиваемого столбца
     * @return Массив состояний ячеек столбца
     */
    public int[] getColumn(int i) {
        return play[i];
    }

    /**
     * Изменяет строку под номером i
     *
     * @param i Номер изменяемой строки
     * @param newLine Массив новых состояний ячеек строки
     */
    public void setLine(int i, int[] newLine) {
        for(int j = 0; j< COUNT_CELLS_X; j++){
            play[j][i] = newLine[j];
        }
    }

    /**
     * Возвращает массив состояний ячеек строки под номером i
     *
     * @param i Номер запрашиваемой строки
     * @return Массив состояний ячеек строки
     */
    public int[] getLine(int i) {
        int[] ret = new int[COUNT_CELLS_X];

        for(int j = 0; j< COUNT_CELLS_X; j++){
            ret[j] = play[j][i];
        }

        return ret;
    }
}
