INSERT INTO authority(role) VALUES ('STUDENT');
INSERT INTO authority(role) VALUES ('TEACHER');
INSERT INTO authority(role) VALUES ('ADMIN');

INSERT INTO account(username, password, active) VALUES ('teststudent','$2a$10$KuowKbe/p.vz6/Y7XvSo9eJFJXRw.xpoLXinTJ9URfJMzBwzAKdCC',true);
INSERT INTO account(username, password, active) VALUES ('testteacher','$2a$10$jkN2zgGoqHcqBfEYHxTzj.eBAyB5v05ZWl8UdYPzPXZyBhDrtzBLe',true);
INSERT INTO account(username, password, active) VALUES ('testadmin','$2a$10$6RMhwGJKqcuXLUQz.q8qCOn2daUF2Lzu4/WjUq5SpjZLEE3RyAxh6',true);

INSERT INTO account_authorities(account_id, authority_id) VALUES (1,1);
INSERT INTO account_authorities(account_id, authority_id) VALUES (2,2);
INSERT INTO account_authorities(account_id, authority_id) VALUES (3,3);
