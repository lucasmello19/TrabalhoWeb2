ALTER TABLE `web2`.`tb_atendimento` 
DROP FOREIGN KEY `fk_tb_atendimento_tb_usuario1`;
ALTER TABLE `web2`.`tb_atendimento` 
DROP COLUMN `fk_login_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`atendimento_id`, `fk_tipoAtend_id`, `fk_user_id`, `fk_perfil_id`, `fk_produto_id`, `fk_categ_id`, `solucao`),
DROP INDEX `fk_tb_atendimento_tb_usuario1_idx` ,
ADD INDEX `fk_tb_atendimento_tb_usuario1_idx` (`fk_user_id` ASC, `fk_perfil_id` ASC);
ALTER TABLE `web2`.`tb_atendimento` 
ADD CONSTRAINT `fk_tb_atendimento_tb_usuario1`
  FOREIGN KEY (`fk_user_id` , `fk_perfil_id`)
  REFERENCES `web2`.`tb_usuario` (`user_id` , `fk_perfil_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `web2`.`tb_usuario` 
DROP FOREIGN KEY `fk_tb_usuario_tb_login1`;
ALTER TABLE `web2`.`tb_usuario` 
DROP COLUMN `fk_login_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`user_id`, `fk_perfil_id`, `fk_cidade_id`, `fk_estado_id`),
DROP INDEX `fk_tb_usuario_tb_login1_idx` ;


DROP TABLE `web2`.`tb_login`;