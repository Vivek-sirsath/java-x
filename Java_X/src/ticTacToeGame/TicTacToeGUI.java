package ticTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame {
    private char currentPlayer = 'X';
    private JButton[][] board = new JButton[3][3];

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = new JButton("");
                board[row][col].setFont(new Font("Arial", Font.PLAIN, 60));
                board[row][col].setBackground(Color.WHITE);
                board[row][col].addActionListener(new ButtonClickListener(row, col));
                add(board[row][col]);
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (board[row][col].getText().equals("") && currentPlayer != ' ') {
                board[row][col].setText(String.valueOf(currentPlayer));
                board[row][col].setForeground(currentPlayer == 'X' ? Color.RED : Color.BLUE);
                if (checkWin()) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                    currentPlayer = ' ';
                    resetBoard();
                } else if (isBoardFull()) {
                    JOptionPane.showMessageDialog(null, "It's a draw!");
                    resetBoard();
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    private void resetBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col].setText("");
                board[row][col].setEnabled(true);
            }
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].getText().equals(String.valueOf(currentPlayer))
                    && board[i][1].getText().equals(String.valueOf(currentPlayer))
                    && board[i][2].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }
            if (board[0][i].getText().equals(String.valueOf(currentPlayer))
                    && board[1][i].getText().equals(String.valueOf(currentPlayer))
                    && board[2][i].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }
        }
        if (board[0][0].getText().equals(String.valueOf(currentPlayer))
                && board[1][1].getText().equals(String.valueOf(currentPlayer))
                && board[2][2].getText().equals(String.valueOf(currentPlayer))) {
            return true;
        }
        return board[0][2].getText().equals(String.valueOf(currentPlayer))
                && board[1][1].getText().equals(String.valueOf(currentPlayer))
                && board[2][0].getText().equals(String.valueOf(currentPlayer));
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeGUI game = new TicTacToeGUI();
            game.setVisible(true);
        });
    }
}