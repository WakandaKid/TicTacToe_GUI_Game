package games.board;

import java.awt.*;
import javax.swing.*;

public class Cell extends JButton {
    private Mark content;
    private final int row, column;
    
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    content = Mark.EMPTY;
    }
    public Mark getContent() { return content; }
    public void setContent(Mark content) { this.content = content;
    }
    public int getRow() { return row; }
    public int getColumn() { return column; }
    
    @Override
    public void paintComponent(Graphics g) {
        //paint the basic button first
        super.paintComponent(g);
        int offset = 5;
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        switch(content) {
            case NOUGHT:
                g2.setColor(Color.RED);
                //Draw O
                g2.drawOval(offset, offset, this.getWidth() - offset * 2, this.getHeight() - offset * 2);
                break;
            case CROSS:
                g2.setColor(Color.BLACK);
                //Draw X
                g2.drawLine(offset, offset, this.getWidth() - offset , this.getHeight() - offset );
                g2.drawLine(this.getWidth() - offset, offset, offset , this.getHeight() - offset);
                break;
        }
    }
}