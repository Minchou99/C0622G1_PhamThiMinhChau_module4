use furama_casestudy_module_4;

SET FOREIGN_KEY_CHECKS=0;
insert into employee (id,is_delete, `name`, date_of_birth, id_card, salary, phone_number, email, address, position_id, education_degree_id ,division_id)
 values(1,1, 'Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', 1, 3, 1),
(2,1, 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2),
(3,1, 'Hồ Thị Yến', '1995-12-12', '999231723', '14000000', '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2),
(4,1, 'Võ Công Toản', '1980-04-04', '123231365', '17000000', '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4, 4),
(5,1, 'Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '6000000', '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', 2, 1, 1),
(6,1, 'Khúc Nguyễn An Nghi', '2000-11-08', '964542311', '7000000', '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', 2, 2, 3),
(7,1, 'Nguyễn Hữu Hà', '1993-01-01', '534323231', '8000000', '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 2, 3, 2),
(8,1, 'Nguyễn Hà Đông', '1989-09-03', '234414123', '9000000', '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 2, 4, 4),
(9,1, 'Tòng Hoang', '1982-09-03', '256781231', '6000000', '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 2, 4, 4),
(10,1, 'Nguyễn Công Đạo', '1994-01-08', '755434343', '8000000', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 2, 3, 2);

insert into position (id, `name` ) values (1,'Lễ tân'),
							(2,'Phục vụ'),
                            (3,'Chuyên viên'),
                            (4,'Giám sát'),
                            (5,'Quản lí'),
                            (6,'Giám đốc');
                            
insert into education_degree (id, `name`)
 values (1, 'Trung Cấp'),
 (2, 'Cao Đẳng'),
 (3, 'Đại Học'),
 (4, 'Sau Đại Học') ;
 
 insert into division (id, `name`) 
 values  (1, 'Sale-Marketing'),
(2, 'Hành chính'),
(3, 'Phục vụ'),
(4, 'Quản lý');

insert into customer_type(id, `name`)
values (1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

insert into customer (id,is_delete, `name`, date_of_birth, gender, id_card, phone_number, email, address, customer_type_id)
values (1,1, 'Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng', 5),
(2,1, 'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị', 3),
(3,1,'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh', 1),
(4,1, 'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng', 1),
(5,1, 'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai', 4),
(6,1, 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng', 4),
(7,1, 'Nguyễn Mỹ Kim', '1984-04-08', 0, '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh', 1),
(8,1, 'Nguyễn Thị Hào', '1999-04-08', 0, '965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum', 3),
(9,1, 'Trần Đại Danh', '1994-07-01', 1, '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi', 1),
(10,1, 'Nguyễn Tâm Đắc', '1989-07-01', 1, '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng', 2);

insert into rent_type (id, `name`)
values(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');

insert into facility_type (id, `name`)
values (1,'Villa'),
(2,'House'),
(3,'Room');

insert into user(username, password)
values('Chou',12345),
('Minchou',12345);

insert into user_role values(1,'Chou'),(2,'Minchou');

insert into role values(1,'admin'),(2,'admin');

insert into facility(id,is_delete, `name`, area, cost, max_people, standard_room, description_other_convenience, pool_area, number_of_floors,facility_free ,rent_type_id, facility_type_id)
values(1,1, 'Villa Beach Front', 25000, 1000000, 10, 'vip', 'Có hồ bơi', '500', 4, null, 3, 1),
(2,1, 'House Princess 01', 14000, 5000000, 7, 'vip', 'Có thêm bếp nướng', 0, 3, null, 2, 2),
(3,1, 'Room Twin 01', 5000, 1000000, 2, 'normal', 'Có tivi', 0, 0, '1 Xe máy, 1 Xe đạp', 4, 3),
(4,1, 'Villa No Beach Front', 22000, 9000000, 8, 'normal', 'Có hồ bơi', '300', 3, null, 3, 1),
(5,1,'House Princess 02', 10000, 4000000, 5, 'normal', 'Có thêm bếp nướng', 0, 2, null, 3, 2),
(6,1, 'Room Twin 02', 3000, 900000, 2, 'normal', 'Có tivi', 0, 0, '1 Xe máy', 4, 3);

insert into attach_facility (id, `name`, cost, unit, `status`)
values (1, 'Karaoke', 10000, 'giờ', 'tiện nghi, hiện tại'),
 (2, 'Thuê xe máy', 10000, 'chiếc', 'hỏng 1 xe'),
 (3, 'Thuê xe đạp', 20000, 'chiếc', 'tốt'),
 (4, 'Buffet buổi sáng', 15000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
 (5, 'Buffet buổi trưa', 90000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
 (6, 'Buffet buổi tối', 16000, 'suất', 'đầy đủ đồ ăn, tráng miệng');

insert into contract (id,is_delete, start_date, end_date, deposit, employee_id, customer_id, facility_id)
values (1,1, '2020-12-08', '2020-12-08', 0, 3, 1, 3),
(2,1, '2020-07-14', '2020-07-21', 200000, 7, 3, 1),
(3,1, '2021-03-15', '2021-03-17', 50000, 3, 4, 2),
(4,1, '2021-01-14', '2021-01-18', 100000, 7, 5, 5),
(5,1, '2021-07-14', '2021-07-15', 0, 7, 2, 6),
(6,1, '2021-06-01', '2021-06-03', 0, 7, 7, 6),
(7,1, '2021-09-02', '2021-09-05', 100000, 7, 4, 4),
(8,1, '2021-06-17', '2021-06-18', 150000, 3, 4, 1),
(9,1, '2020-11-19', '2020-11-19', 0, 3, 4, 3),
(10,1, '2021-04-12', '2021-04-14', 0, 10, 3, 5),
(11,1, '2021-04-25', '2021-04-25', 0, 2, 2, 1),
(12,1, '2021-05-25', '2021-05-27', 0, 7, 10, 1);

insert into contract_detail (id, contract_id, attach_facility_id, quantity)
values (1,2,4,5),
(2,2,5,8),
(3,2,6,15),
(4,3,1,1),
(5,3,2,11),
(6,1,3,1),
(7,1,2,2),
(8,12,2,2);

select f.* from facility f
join facility_type ft on f.facility_type_id = ft.id 
where f.name like '%%' and ft.name like '%%' and f.is_delete = 1;

select ct.id as id, ct.start_date as startDate, 
ct.end_date as endDate, ct.deposit as deposit, f.name as facilityName, 
            e.`name` as employeeName, c.`name` as customerName, c.id,
            (f.cost + ct.deposit + sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0))) 
            as totalMoney 
            from contract ct
            left join facility f on ct.facility_id = f.id 
            left join employee e on ct.employee_id = e.id 
            left join customer c on ct.customer_id = c.id 
            left join contract_detail cd on cd.contract_id = ct.id 
            left join attach_facility af on af.id = cd.attach_facility_id 
            group by ct.id;
            
select ct.*,(f.cost + ct.deposit + sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0))) as totalMoney 
from contract ct left join facility f on ct.facility_id = f.id left join employee e on ct.employee_id = e.id
left join customer c on ct.customer_id = c.id
left join contract_detail cd on cd.contract_id = ct.id
left join attach_facility af on af.id = cd.attach_facility_id 
group by ct.id;


select contract.* , (facility.cost + contract.deposit + sum(ifnull(contract_detail.quantity, 0) * ifnull(attach_facility.cost, 0))) 
as totalMoney from contract left join facility  on contract.facility_id = facility.id 
left join employee  on contract.employee_id = employee.id  
left join customer  on contract.customer_id = customer.id 
left join contract_detail  on contract_detail.contract_id = contract.id  
left join attach_facility on attach_facility.id = contract_detail.attach_facility_id 
group by contract.id;

SELECT attach_facility.`name` AS nameDto,attach_facility.unit AS unitDto, 
sum(ifnull(contract_detail.quantity, 0)) AS quantityDto,
attach_facility.`status` AS statusDto, attach_facility.cost AS costDto 
FROM contract_detail INNER JOIN attach_facility
ON contract_detail.attach_facility_id = attach_facility.id 
WHERE contract_detail.contract_id = 1 GROUP BY attach_facility.id;

SELECT customer.id,  customer.address, customer.date_of_birth, customer.email, customer.`name`, 
contract.end_date AS contractEndDate, contract.start_date AS contractStartDate,
attach_facility.`name` AS nameDto,attach_facility.unit AS unitDto, 
sum(ifnull(contract_detail.quantity, 0)) AS quantityDto,
attach_facility.`status` AS statusDto, attach_facility.cost AS costDto FROM customer 
INNER JOIN contract ON customer.id = contract.customer_id
INNER JOIN contract_detail on contract_detail.contract_id = contract.id
INNER JOIN attach_facility on contract_detail.attach_facility_id= attach_facility.id
WHERE contract.end_date > now() and contract.customer_id = 6
ORDER BY customer.id ASC ;

select* from customer 
inner join contract on customer.id = contract.customer_id
inner join contract_detail on contract_detail.contract_id = contract.id
inner join attach_facility on contract_detail.attach_facility_id = attach_facility.id
WHERE contract.end_date > now();

SELECT * FROM contract_detail 
WHERE contract_detail.contract_id = 1;

 


