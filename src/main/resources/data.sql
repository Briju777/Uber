
INSERT INTO APP_USER(NAME, EMAIL, PASSWORD) VALUES
('Aarav Sharma', 'aarav@gmail.com', 'Aarav@123'),
('Vivaan Patel', 'vivaan@gmail.com', 'Vivaan#456'),
('Aditya Mehta', 'aditya@gmail.com', 'AdiMeh@789'),
('Krishna Reddy', 'krishna@gmail.com', 'KrisRed@321'),
('Ishaan Verma', 'ishaan@gmail.com', 'IshV!456'),
('Dhruv Shah', 'dhruv@gmail.com', 'Dhruv$111'),
('Aryan Joshi', 'aryan@gmail.com', 'AryJos@2024'),
('Anaya Singh', 'anaya@gmail.com', 'AnaS#202'),
('Myra Kapoor', 'myra@gmail.com', 'MyKap@444'),
('Diya Iyer', 'diya@gmail.com', 'Diya!007'),
('Kiara Nair', 'kiara@gmail.com', 'KiaN@808'),
('Aanya Das', 'aanya@gmail.com', 'AanDas#902'),
('Prisha Gupta', 'prisha@gmail.com', 'PriGup@301'),
('Riya Menon', 'riya@gmail.com', 'RiyMen$147'),
('Reyansh Roy', 'reyansh@gmail.com', 'ReyRoy@888'),
('Kabir Bhatia', 'kabir@gmail.com', 'KabBha@369'),
('Neil Malhotra', 'neil@gmail.com', 'NeilM@222'),
('Shaurya Kulkarni', 'shaurya@gmail.com', 'ShaKul@555'),
('Tanishq Saxena', 'tanishq@gmail.com', 'TanSax@010'),
('Avni Chatterjee', 'avni@gmail.com', 'AvnCha#303'),
('Meher Sinha', 'meher@gmail.com', 'MehSin$909');



INSERT INTO user_roles(user_id, roles) VALUES
(1, 'RIDER'),
(2, 'RIDER'),
(3, 'RIDER'),
(4, 'DRIVER'),
(5, 'RIDER'),
(6, 'RIDER'),
(7, 'DRIVER'),
(8, 'RIDER'),
(9, 'DRIVER'),
(10, 'RIDER'),
(11, 'DRIVER'),
(12, 'RIDER'),
(13, 'RIDER'),
(14, 'DRIVER'),
(15, 'DRIVER'),
(16, 'RIDER'),
(17, 'RIDER'),
(18, 'DRIVER'),
(19, 'RIDER'),
(20, 'DRIVER');



INSERT INTO rider (id, user_id, rating) values (1,1,4.9);

INSERT INTO driver(id, user_id, rating, available, current_location) VALUES
(3, 4, 4.2, true, ST_GeomFromText('POINT(72.8777 19.0760)', 4326)),
(4, 5, 3.9, false, ST_GeomFromText('POINT(77.5946 12.9716)', 4326)),
(5, 6, 4.8, true, ST_GeomFromText('POINT(80.2707 13.0827)', 4326)),
(6, 7, 4.0, true, ST_GeomFromText('POINT(73.8567 18.5204)', 4326)),
(7, 8, 4.5, false, ST_GeomFromText('POINT(78.4867 17.3850)', 4326)),
(8, 9, 4.1, true, ST_GeomFromText('POINT(75.8577 22.7196)', 4326)),
(9, 10, 4.6, false, ST_GeomFromText('POINT(74.7973 34.0837)', 4326)),
(10, 11, 3.8, true, ST_GeomFromText('POINT(76.9366 8.5241)', 4326)),
(11, 12, 4.4, false, ST_GeomFromText('POINT(85.8245 20.2961)', 4326)),
(12, 13, 4.9, true, ST_GeomFromText('POINT(88.3639 22.5726)', 4326)),
(13, 14, 4.0, true, ST_GeomFromText('POINT(79.0882 21.1458)', 4326)),
(14, 15, 4.3, false, ST_GeomFromText('POINT(75.7139 26.9124)', 4326)),
(15, 16, 3.7, true, ST_GeomFromText('POINT(76.7794 30.7333)', 4326)),
(16, 17, 4.2, true, ST_GeomFromText('POINT(78.9629 20.5937)', 4326)),
(17, 18, 4.7, false, ST_GeomFromText('POINT(72.5714 23.0225)', 4326)),
(18, 19, 3.9, true, ST_GeomFromText('POINT(78.6569 9.9252)', 4326)),
(19, 20, 4.8, false, ST_GeomFromText('POINT(75.3433 19.9015)', 4326)),
(20, 21, 4.6, true, ST_GeomFromText('POINT(76.9958 11.0168)', 4326));

