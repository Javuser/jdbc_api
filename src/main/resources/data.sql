INSERT INTO chat.users (login, password)
VALUES ('Sultan Alibekov', 'Sultan1234');
INSERT INTO chat.users (login, password)
VALUES ('Nurbakyt', '2oo1Nurik');
INSERT INTO chat.users (login, password)
VALUES ('Nurbol', '1234');
INSERT INTO chat.users (login, password)
VALUES ('Sagyndyk', '3214');
INSERT INTO chat.users (login, password)
VALUES ('Serik', '9876');

INSERT INTO chat.rooms (name, owner)
VALUES ('MMA', 1);
INSERT INTO chat.rooms (name, owner)
VALUES ('BJJ', 2);
INSERT INTO chat.rooms (name, owner)
VALUES ('Freestyle Wrestling', 3);
INSERT INTO chat.rooms (name, owner)
VALUES ('Boxing', 4);
INSERT INTO chat.rooms (name, owner)
VALUES ('Basketball', 5);

INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (1, 1, 'Conor McGregor is champion in 2 weight class', '2018-01-01 08:12:01');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (2, 3, 'Ryan Gordon is bjj black belt owner', '2018-01-01 00:05:01');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (5, 3, 'Good job!', '2018-01-01 00:00:02');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (4, 4, 'LOL', '2018-01-01 00:00:04');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (5, 5, 'Hello!', '2018-01-01 00:00:05');