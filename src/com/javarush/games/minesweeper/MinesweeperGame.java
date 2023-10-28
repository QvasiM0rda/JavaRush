package com.javarush.games.minesweeper;

import com.javarus;
import java.util.ArrayList;

public class MinesweeperGame extends Game{
    private static final int SIDE = 9;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;
    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) == 1;
                gameField[y][x] = new GameObject(x, y, isMine);
                countMinesOnField += isMine ? 1 : 0;
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    public ArrayList<GameObject> getNeighbors(GameObject gameObject) {
        ArrayList<GameObject> neighbors = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1 ; y++) {
            if (y < 0 || y >= SIDE) {
                continue;
            }
            for (int x = gameObject.x - 1; x <= gameObject.x + 1 ; x++) {
                if (x < 0 || x >= SIDE || gameObject == gameField[y][x]) {
                    continue;
                }
                neighbors.add(gameField[y][x]);
            }
        }
        return neighbors;
    }
    
    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (gameObject.isMine) {
                    continue;
                }
                for (GameObject neighbor :
                        getNeighbors(gameObject)) {
                    gameObject.countMineNeighbors += neighbor.isMine ? 1 : 0;
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (isGameStopped || gameObject.isFlag || gameObject.isOpen) {
            return;
        }
        gameObject.isOpen = true;
        if (!gameObject.isMine) {
            score += 5;
        }
        countClosedTiles--;
        if (countClosedTiles == countMinesOnField && !gameObject.isMine) {
            win();
        }
        setScore(score);
        setCellColor(x, y, Color.GREEN);
        if (gameObject.isMine) {
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(x, y, "");
            for (GameObject neighbor :
                    getNeighbors(gameObject)) {
                if (!neighbor.isOpen) {
                    openTile(neighbor.x, neighbor.y);
                }
                }
        } else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isOpen || isGameStopped) {
            return;
        }
        if (!gameObject.isFlag && countFlags <= 0) {
            return;
        }

        if (gameObject.isFlag) {
            gameObject.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        } else {
            gameObject.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);
        }
    }

    private void openAllTiles() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameField[y][x].isOpen) {
                    if (gameObject.isMine) {
                        setCellValue(x, y, MINE);
                        setCellColor(x, y, Color.RED);
                    }
                }
            }
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "YOU DIED", Color.BLACK, 20);
        openAllTiles();
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "GOOD JOB", Color.BLACK, 20);
        openAllTiles();
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        score = 0;
        setScore(0);
        createGame();
    }
}