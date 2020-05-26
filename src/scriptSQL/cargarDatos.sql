INSERT INTO seguridad.usuarios (idUsuarios, nombre, user, pass) VALUES ('1', 'Ruben Regalado', 'rpregalado', 'MAevNSxYez+YZOabq8aCpQ==');
INSERT INTO seguridad.usuarios (idUsuarios, nombre, user, pass) VALUES ('2', 'Victoria Endara', 'vendara', 'Ajpes8yA/yEN2RvbQGH9rw==');

INSERT INTO seguridad.roles (idRoles, descripcion) VALUES ('1', 'Administrador');
INSERT INTO seguridad.roles (idRoles, descripcion) VALUES ('2', 'Docente');
INSERT INTO seguridad.roles (idRoles, descripcion) VALUES ('3', 'Estudiante');
INSERT INTO seguridad.roles (idRoles, descripcion) VALUES ('4', 'Secretaria');

INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('1', 'Ingresar Notas');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('2', 'Ver Alumnos');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('3', 'Subir Recursos');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('4', 'Ver Calificaciones');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('5', 'Modificar Perfil');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('6', 'Descargar Recursos');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('7', 'Matricular');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('8', 'Cobrar Pensiones');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('9', 'Enviar Notificaciones');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('10', 'CRUD Usuarios');
INSERT INTO seguridad.funciones (idFunciones, descripcion) VALUES ('11', 'CRUD Roles');

INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('1', '10', '1');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('2', '11', '1');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('3', '1', '2');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('4', '2', '2');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('5', '3', '2');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('6', '4', '3');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('7', '5', '3');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('8', '6', '3');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('9', '7', '4');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('10', '8', '4');
INSERT INTO seguridad.rolesfunciones (idRolesFunciones, Funciones_idFunciones, Roles_idRoles) VALUES ('11', '9', '4');

INSERT INTO seguridad.usuariosroles (idUsuariosRoles, Usuarios_idUsuarios, Roles_idRoles) VALUES ('1', '1', '1');
INSERT INTO seguridad.usuariosroles (idUsuariosRoles, Usuarios_idUsuarios, Roles_idRoles) VALUES ('2', '1', '2');
INSERT INTO seguridad.usuariosroles (idUsuariosRoles, Usuarios_idUsuarios, Roles_idRoles) VALUES ('3', '2', '3');
INSERT INTO seguridad.usuariosroles (idUsuariosRoles, Usuarios_idUsuarios, Roles_idRoles) VALUES ('4', '2', '4');
