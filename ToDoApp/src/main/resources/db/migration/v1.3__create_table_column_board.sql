DROP TABLE IF EXISTS COLUMN_BOARD;

CREATE TABLE COLUMN_BOARD
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    order_board INT DEFAULT 0
);