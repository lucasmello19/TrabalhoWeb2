INSERT INTO tb_tipo_atendimento (nome) VALUES ('Reclamação');
INSERT INTO tb_tipo_atendimento (nome) VALUES ('Sugestão');
INSERT INTO tb_tipo_atendimento (nome) VALUES ('Crítica');
INSERT INTO tb_tipo_atendimento (nome) VALUES ('Problema');

INSERT INTO tb_estado VALUES (01, 'AC', 'Acre');
INSERT INTO tb_estado VALUES (02, 'AL', 'Alagoas');
INSERT INTO tb_estado VALUES (03, 'AM', 'Amazonas');
INSERT INTO tb_estado VALUES (04, 'AP', 'Amapá');
INSERT INTO tb_estado VALUES (05, 'BA', 'Bahia');
INSERT INTO tb_estado VALUES (06, 'CE', 'Ceará');
INSERT INTO tb_estado VALUES (07, 'DF', 'Distrito Federal');
INSERT INTO tb_estado VALUES (08, 'ES', 'Espírito Santo');
INSERT INTO tb_estado VALUES (09, 'GO', 'Goiás');
INSERT INTO tb_estado VALUES (10, 'MA', 'Maranhão');
INSERT INTO tb_estado VALUES (11, 'MG', 'Minas Gerais');
INSERT INTO tb_estado VALUES (12, 'MS', 'Mato Grosso do Sul');
INSERT INTO tb_estado VALUES (13, 'MT', 'Mato Grosso');
INSERT INTO tb_estado VALUES (14, 'PA', 'Pará');
INSERT INTO tb_estado VALUES (15, 'PB', 'Paraíba');
INSERT INTO tb_estado VALUES (16, 'PE', 'Pernambuco');
INSERT INTO tb_estado VALUES (17, 'PI', 'Piauí');
INSERT INTO tb_estado VALUES (18, 'PR', 'Paraná');
INSERT INTO tb_estado VALUES (19, 'RJ', 'Rio de Janeiro');
INSERT INTO tb_estado VALUES (20, 'RN', 'Rio Grande do Norte');
INSERT INTO tb_estado VALUES (21, 'RO', 'Rondônia');
INSERT INTO tb_estado VALUES (22, 'RR', 'Roraima');
INSERT INTO tb_estado VALUES (23, 'RS', 'Rio Grande do Sul');
INSERT INTO tb_estado VALUES (24, 'SC', 'Santa Catarina');
INSERT INTO tb_estado VALUES (25, 'SE', 'Sergipe');
INSERT INTO tb_estado VALUES (26, 'SP', 'São Paulo');
INSERT INTO tb_estado VALUES (27, 'TO', 'Tocantins');

INSERT INTO tb_categoria (nome) VALUES ('Cosmético facial');
INSERT INTO tb_categoria (nome) VALUES ('Esmaltes');
INSERT INTO tb_categoria (nome) VALUES ('Cosmético de tratamento Facial');
INSERT INTO tb_categoria (nome) VALUES ('Cosmético corporal');


INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id) VALUES ('Batom','Produto cosmético para os lábios', 10, 1, 1);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Rimel', 'Produto cosmético para os cílios', 8, 2, 3);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Blush', 'Produto cosmético para a pele', 20, 3, 4);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Po compacto', 'Produto cosmético para a pele', 25, 4, 4);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Corretivo', 'Produto cosmético para a pele', 15, 5, 4);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Iluminador', 'Produto cosmético para a pele', 30, 6, 2);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Sombra', 'Produto cosmético para os cílios', 5, 7, 1);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Paleta de contorno', 'Produto cosmético para a pele', 50, 8, 4);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Esmalte colorido', 'Produto cosmético para as unhas', 10, 9, 2);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Creme hidratante', 'Produto cosmético para a pele', 100, 10, 4);
INSERT INTO tb_produto (nome, descricao, peso, produto_id, fk_categ_id)  VALUES ('Protetor solar', 'Produto de tratamento para o rosto', 75, 11, 1);

INSERT INTO tb_cidade VALUES (1,	'Acrelandia	'	,	1	);
INSERT INTO tb_cidade VALUES (	2	,	'	Assis Brasil	'	,	1	);
INSERT INTO tb_cidade VALUES (	3	,	'	Brasileia	'	,	1	);
INSERT INTO tb_cidade VALUES (	4	,	'	Bujari	'	,	1	);
INSERT INTO tb_cidade VALUES (	5	,	'	Capixaba	'	,	1	);
INSERT INTO tb_cidade VALUES (	6	,	'	Cruzeiro do Sul	'	,	1	);
INSERT INTO tb_cidade VALUES (	7	,	'	Epitaciolandia	'	,	1	);
INSERT INTO tb_cidade VALUES (	8	,	'	Feijo	'	,	1	);
INSERT INTO tb_cidade VALUES (	9	,	'	Jordao	'	,	1	);
INSERT INTO tb_cidade VALUES (	10	,	'	Mancio Lima	'	,	1	);
INSERT INTO tb_cidade VALUES (	11	,	'	Agua Branca	'	,	2	);
INSERT INTO tb_cidade VALUES (	12	,	'	Alazao	'	,	2	);
INSERT INTO tb_cidade VALUES (	13	,	'	Alecrim	'	,	2	);
INSERT INTO tb_cidade VALUES (	14	,	'	Anadia	'	,	2	);
INSERT INTO tb_cidade VALUES (	15	,	'	Anel	'	,	2	);
INSERT INTO tb_cidade VALUES (	16	,	'	Anum Novo	'	,	2	);
INSERT INTO tb_cidade VALUES (	17	,	'	Anum Velho	'	,	2	);
INSERT INTO tb_cidade VALUES (	18	,	'	Arapiraca	'	,	2	);
INSERT INTO tb_cidade VALUES (	19	,	'	Atalaia	'	,	2	);
INSERT INTO tb_cidade VALUES (	20	,	'	Baixa da Onca	'	,	2	);
INSERT INTO tb_cidade VALUES (	21	,	'	Autazes	'	,	3	);
INSERT INTO tb_cidade VALUES (	22	,	'	Axinim	'	,	3	);
INSERT INTO tb_cidade VALUES (	23	,	'	Badajos	'	,	3	);
INSERT INTO tb_cidade VALUES (	24	,	'	Balbina	'	,	3	);
INSERT INTO tb_cidade VALUES (	25	,	'	Barcelos	'	,	3	);
INSERT INTO tb_cidade VALUES (	26	,	'	Barreirinha	'	,	3	);
INSERT INTO tb_cidade VALUES (	27	,	'	Benjamin Constant	'	,	3	);
INSERT INTO tb_cidade VALUES (	28	,	'	Beruri	'	,	3	);
INSERT INTO tb_cidade VALUES (	29	,	'	Boa Vista do Ramos	'	,	3	);
INSERT INTO tb_cidade VALUES (	30	,	'	Boca do Acre	'	,	3	);
INSERT INTO tb_cidade VALUES (	31	,	'	Inaja	'	,	4	);
INSERT INTO tb_cidade VALUES (	32	,	'	Itaubal	'	,	4	);
INSERT INTO tb_cidade VALUES (	33	,	'	Laranjal do Jari	'	,	4	);
INSERT INTO tb_cidade VALUES (	34	,	'	Livramento do Pacui	'	,	4	);
INSERT INTO tb_cidade VALUES (	35	,	'	Lourenco	'	,	4	);
INSERT INTO tb_cidade VALUES (	36	,	'	Macapa	'	,	4	);
INSERT INTO tb_cidade VALUES (	37	,	'	Mazagao	'	,	4	);
INSERT INTO tb_cidade VALUES (	38	,	'	Mazagao Velho	'	,	4	);
INSERT INTO tb_cidade VALUES (	39	,	'	Oiapoque	'	,	4	);
INSERT INTO tb_cidade VALUES (	40	,	'	Paredao	'	,	4	);
INSERT INTO tb_cidade VALUES (	41	,	'	Alcobaca	'	,	5	);
INSERT INTO tb_cidade VALUES (	42	,	'	Alegre	'	,	5	);
INSERT INTO tb_cidade VALUES (	43	,	'	Algodao	'	,	5	);
INSERT INTO tb_cidade VALUES (	44	,	'	Algodoes	'	,	5	);
INSERT INTO tb_cidade VALUES (	45	,	'	Almadina	'	,	5	);
INSERT INTO tb_cidade VALUES (	46	,	'	Alto Bonito	'	,	5	);
INSERT INTO tb_cidade VALUES (	47	,	'	Baixinha	'	,	5	);
INSERT INTO tb_cidade VALUES (	48	,	'	Baluarte	'	,	5	);
INSERT INTO tb_cidade VALUES (	49	,	'	Banco Central	'	,	5	);
INSERT INTO tb_cidade VALUES (	50	,	'	Banco da Vitoria	'	,	5	);
INSERT INTO tb_cidade VALUES (	51	,	'	Abaiara	'	,	6	);
INSERT INTO tb_cidade VALUES (	52	,	'	Abilio Martins	'	,	6	);
INSERT INTO tb_cidade VALUES (	53	,	'	Acarape	'	,	6	);
INSERT INTO tb_cidade VALUES (	54	,	'	Acarau	'	,	6	);
INSERT INTO tb_cidade VALUES (	55	,	'	Acopiara	'	,	6	);
INSERT INTO tb_cidade VALUES (	56	,	'	Adrianopolis	'	,	6	);
INSERT INTO tb_cidade VALUES (	57	,	'	Agua Verde	'	,	6	);
INSERT INTO tb_cidade VALUES (	58	,	'	Aguai	'	,	6	);
INSERT INTO tb_cidade VALUES (	59	,	'	Aiua	'	,	6	);
INSERT INTO tb_cidade VALUES (	60	,	'	Aiuaba	'	,	6	);
INSERT INTO tb_cidade VALUES (	61	,	'	Alagoinha	'	,	6	);
INSERT INTO tb_cidade VALUES (	62	,	'	Alcantaras	'	,	6	);
INSERT INTO tb_cidade VALUES (	63	,	'	Algodoes	'	,	6	);
INSERT INTO tb_cidade VALUES (	64	,	'	Brasília	'	,	7	);
INSERT INTO tb_cidade VALUES (	65	,	'	Candamgolandia	'	,	7	);
INSERT INTO tb_cidade VALUES (	66	,	'	Ceilandia	'	,	7	);
INSERT INTO tb_cidade VALUES (	67	,	'	Cruzeiro	'	,	7	);
INSERT INTO tb_cidade VALUES (	68	,	'	Gama	'	,	7	);
INSERT INTO tb_cidade VALUES (	69	,	'	Guara	'	,	7	);
INSERT INTO tb_cidade VALUES (	70	,	'	Lago Norte	'	,	7	);
INSERT INTO tb_cidade VALUES (	71	,	'	Lago Sul	'	,	7	);
INSERT INTO tb_cidade VALUES (	72	,	'	Paranoa	'	,	7	);
INSERT INTO tb_cidade VALUES (	73	,	'	Samabaia	'	,	7	);
INSERT INTO tb_cidade VALUES (	74	,	'	Alto Calcado	'	,	8	);
INSERT INTO tb_cidade VALUES (	75	,	'	Alto Caldeirao	'	,	8	);
INSERT INTO tb_cidade VALUES (	76	,	'	Alto Mutum Preto	'	,	8	);
INSERT INTO tb_cidade VALUES (	77	,	'	Alto Rio Novo	'	,	8	);
INSERT INTO tb_cidade VALUES (	78	,	'	Alto Santa Maria	'	,	8	);
INSERT INTO tb_cidade VALUES (	79	,	'	Anchieta	'	,	8	);
INSERT INTO tb_cidade VALUES (	80	,	'	Angelo Frechiani	'	,	8	);
INSERT INTO tb_cidade VALUES (	81	,	'	Anutiba	'	,	8	);
INSERT INTO tb_cidade VALUES (	82	,	'	Apiaca	'	,	8	);
INSERT INTO tb_cidade VALUES (	83	,	'	Aracatiba	'	,	8	);
INSERT INTO tb_cidade VALUES (	84	,	'	Arace	'	,	8	);
INSERT INTO tb_cidade VALUES (	85	,	'	Aracruz	'	,	8	);
INSERT INTO tb_cidade VALUES (	86	,	'	Aparecida de Goias	'	,	9	);
INSERT INTO tb_cidade VALUES (	87	,	'	Aparecida do Rio Claro	'	,	9	);
INSERT INTO tb_cidade VALUES (	88	,	'	Aparecida do Rio Doce	'	,	9	);
INSERT INTO tb_cidade VALUES (	89	,	'	Apore	'	,	9	);
INSERT INTO tb_cidade VALUES (	90	,	'	Aracu	'	,	9	);
INSERT INTO tb_cidade VALUES (	91	,	'	Aragarcas	'	,	9	);
INSERT INTO tb_cidade VALUES (	92	,	'	Aragoiania	'	,	9	);
INSERT INTO tb_cidade VALUES (	93	,	'	Araguapaz	'	,	9	);
INSERT INTO tb_cidade VALUES (	94	,	'	Arenopolis	'	,	9	);
INSERT INTO tb_cidade VALUES (	95	,	'	Aruana	'	,	9	);
INSERT INTO tb_cidade VALUES (	96	,	'	Aurilandia	'	,	9	);
INSERT INTO tb_cidade VALUES (	97	,	'	Auriverde	'	,	9	);
INSERT INTO tb_cidade VALUES (	98	,	'	Avelinopolis	'	,	9	);
INSERT INTO tb_cidade VALUES (	99	,	'	Bacilandia	'	,	9	);
INSERT INTO tb_cidade VALUES (	100	,	'	Coroata	'	,	10	);
INSERT INTO tb_cidade VALUES (	101	,	'	Curupa	'	,	10	);
INSERT INTO tb_cidade VALUES (	102	,	'	Cururupu	'	,	10	);
INSERT INTO tb_cidade VALUES (	103	,	'	Curva Grande	'	,	10	);
INSERT INTO tb_cidade VALUES (	104	,	'	Custodio Lima	'	,	10	);
INSERT INTO tb_cidade VALUES (	105	,	'	Davinopolis	'	,	10	);
INSERT INTO tb_cidade VALUES (	106	,	'	Dom Pedro	'	,	10	);
INSERT INTO tb_cidade VALUES (	107	,	'	Duque Bacelar	'	,	10	);
INSERT INTO tb_cidade VALUES (	108	,	'	Esperantinopolis	'	,	10	);
INSERT INTO tb_cidade VALUES (	109	,	'	Estandarte	'	,	10	);
INSERT INTO tb_cidade VALUES (	110	,	'	Estreito	'	,	10	);
INSERT INTO tb_cidade VALUES (	111	,	'	Feira Nova do Maranhao	'	,	10	);
INSERT INTO tb_cidade VALUES (	112	,	'	Fernando Falcao	'	,	10	);
INSERT INTO tb_cidade VALUES (	113	,	'	Formosa da Serra Negra	'	,	10	);
INSERT INTO tb_cidade VALUES (	114	,	'	Amarantina	'	,	11	);
INSERT INTO tb_cidade VALUES (	115	,	'	Amparo da Serra	'	,	11	);
INSERT INTO tb_cidade VALUES (	116	,	'	Andiroba	'	,	11	);
INSERT INTO tb_cidade VALUES (	117	,	'	Andradas	'	,	11	);
INSERT INTO tb_cidade VALUES (	118	,	'	Andrelandia	'	,	11	);
INSERT INTO tb_cidade VALUES (	119	,	'	Andrequice	'	,	11	);
INSERT INTO tb_cidade VALUES (	120	,	'	Angaturama	'	,	11	);
INSERT INTO tb_cidade VALUES (	121	,	'	Angelandia	'	,	11	);
INSERT INTO tb_cidade VALUES (	122	,	'	Angicos de Minas	'	,	11	);
INSERT INTO tb_cidade VALUES (	123	,	'	Anguereta	'	,	11	);
INSERT INTO tb_cidade VALUES (	124	,	'	Angustura	'	,	11	);
INSERT INTO tb_cidade VALUES (	125	,	'	Antonio Carlos	'	,	11	);
INSERT INTO tb_cidade VALUES (	126	,	'	Antonio Dias	'	,	11	);
INSERT INTO tb_cidade VALUES (	127	,	'	Belo Horizonte	'	,	11	);
INSERT INTO tb_cidade VALUES (	128	,	'	Uberlandia	'	,	11	);
INSERT INTO tb_cidade VALUES (	129	,	'	Bocaja	'	,	12	);
INSERT INTO tb_cidade VALUES (	130	,	'	Bodoquena	'	,	12	);
INSERT INTO tb_cidade VALUES (	131	,	'	Bom Fim	'	,	12	);
INSERT INTO tb_cidade VALUES (	132	,	'	Bonito	'	,	12	);
INSERT INTO tb_cidade VALUES (	133	,	'	Boqueirao	'	,	12	);
INSERT INTO tb_cidade VALUES (	134	,	'	Brasilandia	'	,	12	);
INSERT INTO tb_cidade VALUES (	135	,	'	Caarapo	'	,	12	);
INSERT INTO tb_cidade VALUES (	136	,	'	Cabeceira do Apa	'	,	12	);
INSERT INTO tb_cidade VALUES (	137	,	'	Cachoeira	'	,	12	);
INSERT INTO tb_cidade VALUES (	138	,	'	Camapua	'	,	12	);
INSERT INTO tb_cidade VALUES (	139	,	'	Camisao	'	,	12	);
INSERT INTO tb_cidade VALUES (	140	,	'	Campestre	'	,	12	);
INSERT INTO tb_cidade VALUES (	141	,	'	Campo Grande	'	,	12	);
INSERT INTO tb_cidade VALUES (	142	,	'	Caceres	'	,	13	);
INSERT INTO tb_cidade VALUES (	143	,	'	Caite	'	,	13	);
INSERT INTO tb_cidade VALUES (	144	,	'	Campinapolis	'	,	13	);
INSERT INTO tb_cidade VALUES (	145	,	'	Campo Novo do Parecis	'	,	13	);
INSERT INTO tb_cidade VALUES (	146	,	'	Campo Verde	'	,	13	);
INSERT INTO tb_cidade VALUES (	147	,	'	Campos de Julio	'	,	13	);
INSERT INTO tb_cidade VALUES (	148	,	'	Campos Novos	'	,	13	);
INSERT INTO tb_cidade VALUES (	149	,	'	Canabrava do Norte	'	,	13	);
INSERT INTO tb_cidade VALUES (	150	,	'	Canarana	'	,	13	);
INSERT INTO tb_cidade VALUES (	151	,	'	Cangas	'	,	13	);
INSERT INTO tb_cidade VALUES (	152	,	'	Capao Grande	'	,	13	);
INSERT INTO tb_cidade VALUES (	153	,	'	Capao Verde	'	,	13	);
INSERT INTO tb_cidade VALUES (	154	,	'	Barreiras	'	,	14	);
INSERT INTO tb_cidade VALUES (	155	,	'	Baturite	'	,	14	);
INSERT INTO tb_cidade VALUES (	156	,	'	Beja	'	,	14	);
INSERT INTO tb_cidade VALUES (	157	,	'	Bela Vista do Caracol	'	,	14	);
INSERT INTO tb_cidade VALUES (	158	,	'	Belem	'	,	14	);
INSERT INTO tb_cidade VALUES (	159	,	'	Belterra	'	,	14	);
INSERT INTO tb_cidade VALUES (	160	,	'	Benevides	'	,	14	);
INSERT INTO tb_cidade VALUES (	161	,	'	Cambuquira	'	,	14	);
INSERT INTO tb_cidade VALUES (	162	,	'	Cameta	'	,	14	);
INSERT INTO tb_cidade VALUES (	163	,	'	Camiranga	'	,	14	);
INSERT INTO tb_cidade VALUES (	164	,	'	Carajas	'	,	14	);
INSERT INTO tb_cidade VALUES (	165	,	'	Carapajo	'	,	14	);
INSERT INTO tb_cidade VALUES (	166	,	'	Caraparu	'	,	14	);
INSERT INTO tb_cidade VALUES (	167	,	'	Caratateua	'	,	14	);
INSERT INTO tb_cidade VALUES (	168	,	'	Caripi	'	,	14	);
INSERT INTO tb_cidade VALUES (	169	,	'	Carrazedo	'	,	14	);
INSERT INTO tb_cidade VALUES (	170	,	'	Castanhal	'	,	14	);
INSERT INTO tb_cidade VALUES (	171	,	'	Igaracy	'	,	15	);
INSERT INTO tb_cidade VALUES (	172	,	'	Imaculada	'	,	15	);
INSERT INTO tb_cidade VALUES (	173	,	'	Inga	'	,	15	);
INSERT INTO tb_cidade VALUES (	174	,	'	Itabaiana	'	,	15	);
INSERT INTO tb_cidade VALUES (	175	,	'	Itajubatiba	'	,	15	);
INSERT INTO tb_cidade VALUES (	176	,	'	Itaporanga	'	,	15	);
INSERT INTO tb_cidade VALUES (	177	,	'	Itapororoca	'	,	15	);
INSERT INTO tb_cidade VALUES (	178	,	'	Itatuba	'	,	15	);
INSERT INTO tb_cidade VALUES (	179	,	'	Jacarau	'	,	15	);
INSERT INTO tb_cidade VALUES (	180	,	'	Jerico	'	,	15	);
INSERT INTO tb_cidade VALUES (	181	,	'	Joao Pessoa	'	,	15	);
INSERT INTO tb_cidade VALUES (	182	,	'	Juarez Tavora	'	,	15	);
INSERT INTO tb_cidade VALUES (	183	,	'	Juazeirinho	'	,	15	);
INSERT INTO tb_cidade VALUES (	184	,	'	Abreu E Lima	'	,	16	);
INSERT INTO tb_cidade VALUES (	185	,	'	Afogados da Ingazeira	'	,	16	);
INSERT INTO tb_cidade VALUES (	186	,	'	Afranio	'	,	16	);
INSERT INTO tb_cidade VALUES (	187	,	'	Agrestina	'	,	16	);
INSERT INTO tb_cidade VALUES (	188	,	'	Agua Fria	'	,	16	);
INSERT INTO tb_cidade VALUES (	189	,	'	Agua Preta	'	,	16	);
INSERT INTO tb_cidade VALUES (	190	,	'	Aguas Belas	'	,	16	);
INSERT INTO tb_cidade VALUES (	191	,	'	Airi	'	,	16	);
INSERT INTO tb_cidade VALUES (	192	,	'	Alagoinha	'	,	16	);
INSERT INTO tb_cidade VALUES (	193	,	'	Albuquerque Ne	'	,	16	);
INSERT INTO tb_cidade VALUES (	194	,	'	Algodoes	'	,	16	);
INSERT INTO tb_cidade VALUES (	195	,	'	Alianca	'	,	16	);
INSERT INTO tb_cidade VALUES (	196	,	'	Altinho	'	,	16	);
INSERT INTO tb_cidade VALUES (	197	,	'	Amaraji	'	,	16	);
INSERT INTO tb_cidade VALUES (	198	,	'	Ameixas	'	,	16	);
INSERT INTO tb_cidade VALUES (	199	,	'	Angelim	'	,	16	);
INSERT INTO tb_cidade VALUES (	200	,	'	Apoti	'	,	16	);
INSERT INTO tb_cidade VALUES (	201	,	'	Aracoiaba	'	,	16	);
INSERT INTO tb_cidade VALUES (	202	,	'	Sao Miguel do Tapuio	'	,	17	);
INSERT INTO tb_cidade VALUES (	203	,	'	Sao Pedro do Piaui	'	,	17	);
INSERT INTO tb_cidade VALUES (	204	,	'	Sao Raimundo Nonato	'	,	17	);
INSERT INTO tb_cidade VALUES (	205	,	'	Sebastiao Barros	'	,	17	);
INSERT INTO tb_cidade VALUES (	206	,	'	Sebastiao Leal	'	,	17	);
INSERT INTO tb_cidade VALUES (	207	,	'	Sigefredo Pacheco	'	,	17	);
INSERT INTO tb_cidade VALUES (	208	,	'	Simoes	'	,	17	);
INSERT INTO tb_cidade VALUES (	209	,	'	Simplicio Mendes	'	,	17	);
INSERT INTO tb_cidade VALUES (	210	,	'	Socorro do Piaui	'	,	17	);
INSERT INTO tb_cidade VALUES (	211	,	'	Sussuapara	'	,	17	);
INSERT INTO tb_cidade VALUES (	212	,	'	Tamboril do Piaui	'	,	17	);
INSERT INTO tb_cidade VALUES (	213	,	'	Tanque do Piaui	'	,	17	);
INSERT INTO tb_cidade VALUES (	214	,	'	Teresina	'	,	17	);
INSERT INTO tb_cidade VALUES (	215	,	'	Uniao	'	,	17	);
INSERT INTO tb_cidade VALUES (	216	,	'	Almirante Tamandare	'	,	18	);
INSERT INTO tb_cidade VALUES (	217	,	'	Bragantina	'	,	18	);
INSERT INTO tb_cidade VALUES (	218	,	'	Brasilandia do Sul	'	,	18	);
INSERT INTO tb_cidade VALUES (	219	,	'	Cachoeira	'	,	18	);
INSERT INTO tb_cidade VALUES (	220	,	'	Campina Grande do Sul	'	,	18	);
INSERT INTO tb_cidade VALUES (	221	,	'	Campinas	'	,	18	);
INSERT INTO tb_cidade VALUES (	222	,	'	Campo Bonito	'	,	18	);
INSERT INTO tb_cidade VALUES (	223	,	'	Campo do Meio	'	,	18	);
INSERT INTO tb_cidade VALUES (	224	,	'	Campo do Tenente	'	,	18	);
INSERT INTO tb_cidade VALUES (	225	,	'	Campo Largo	'	,	18	);
INSERT INTO tb_cidade VALUES (	226	,	'	Curitiba	'	,	18	);
INSERT INTO tb_cidade VALUES (	227	,	'	Dorandia	'	,	19	);
INSERT INTO tb_cidade VALUES (	228	,	'	Dores de Macabu	'	,	19	);
INSERT INTO tb_cidade VALUES (	229	,	'	Doutor Elias	'	,	19	);
INSERT INTO tb_cidade VALUES (	230	,	'	Doutor Loreti	'	,	19	);
INSERT INTO tb_cidade VALUES (	231	,	'	Duas Barras	'	,	19	);
INSERT INTO tb_cidade VALUES (	232	,	'	Duque de Caxias	'	,	19	);
INSERT INTO tb_cidade VALUES (	233	,	'	Engenheiro Passos	'	,	19	);
INSERT INTO tb_cidade VALUES (	234	,	'	Engenheiro Paulo de Frontin	'	,	19	);
INSERT INTO tb_cidade VALUES (	235	,	'	Engenheiro Pedreira	'	,	19	);
INSERT INTO tb_cidade VALUES (	236	,	'	Estrada Nova	'	,	19	);
INSERT INTO tb_cidade VALUES (	237	,	'	Valenca	'	,	19	);
INSERT INTO tb_cidade VALUES (	238	,	'	Vargem Alegre	'	,	19	);
INSERT INTO tb_cidade VALUES (	239	,	'	Varre-sai	'	,	19	);
INSERT INTO tb_cidade VALUES (	240	,	'	Martins	'	,	20	);
INSERT INTO tb_cidade VALUES (	241	,	'	Mata de Sao Braz	'	,	20	);
INSERT INTO tb_cidade VALUES (	242	,	'	Maxaranguape	'	,	20	);
INSERT INTO tb_cidade VALUES (	243	,	'	Messias Targino	'	,	20	);
INSERT INTO tb_cidade VALUES (	244	,	'	Montanhas	'	,	20	);
INSERT INTO tb_cidade VALUES (	245	,	'	Monte Alegre	'	,	20	);
INSERT INTO tb_cidade VALUES (	246	,	'	Monte das Gameleiras	'	,	20	);
INSERT INTO tb_cidade VALUES (	247	,	'	Mossoro	'	,	20	);
INSERT INTO tb_cidade VALUES (	248	,	'	Natal	'	,	20	);
INSERT INTO tb_cidade VALUES (	249	,	'	Nisia Floresta	'	,	20	);
INSERT INTO tb_cidade VALUES (	250	,	'	Nova Cruz	'	,	20	);
INSERT INTO tb_cidade VALUES (	251	,	'	Olho-dagua Do Borges	'	,	20	);
INSERT INTO tb_cidade VALUES (	252	,	'	Ouro Branco	'	,	20	);
INSERT INTO tb_cidade VALUES (	253	,	'	Nova Mamore	'	,	21	);
INSERT INTO tb_cidade VALUES (	254	,	'	Nova Uniao	'	,	21	);
INSERT INTO tb_cidade VALUES (	255	,	'	Nova Vida	'	,	21	);
INSERT INTO tb_cidade VALUES (	256	,	'	Novo Horizonte do Oeste	'	,	21	);
INSERT INTO tb_cidade VALUES (	257	,	'	Ouro Preto do Oeste	'	,	21	);
INSERT INTO tb_cidade VALUES (	258	,	'	Parecis	'	,	21	);
INSERT INTO tb_cidade VALUES (	259	,	'	Pedras Negras	'	,	21	);
INSERT INTO tb_cidade VALUES (	260	,	'	Pimenta Bueno	'	,	21	);
INSERT INTO tb_cidade VALUES (	261	,	'	Pimenteiras do Oeste	'	,	21	);
INSERT INTO tb_cidade VALUES (	262	,	'	Porto Velho	'	,	21	);
INSERT INTO tb_cidade VALUES (	263	,	'	Presidente Medici	'	,	21	);
INSERT INTO tb_cidade VALUES (	264	,	'	Primavera de Rondonia	'	,	21	);
INSERT INTO tb_cidade VALUES (	265	,	'	Alto Alegre	'	,	22	);
INSERT INTO tb_cidade VALUES (	266	,	'	Amajari	'	,	22	);
INSERT INTO tb_cidade VALUES (	267	,	'	Boa Vista	'	,	22	);
INSERT INTO tb_cidade VALUES (	268	,	'	Bonfim	'	,	22	);
INSERT INTO tb_cidade VALUES (	269	,	'	Canta	'	,	22	);
INSERT INTO tb_cidade VALUES (	270	,	'	Caracarai	'	,	22	);
INSERT INTO tb_cidade VALUES (	271	,	'	Caroebe	'	,	22	);
INSERT INTO tb_cidade VALUES (	272	,	'	Iracema	'	,	22	);
INSERT INTO tb_cidade VALUES (	273	,	'	Mucajai	'	,	22	);
INSERT INTO tb_cidade VALUES (	274	,	'	Normandia	'	,	22	);
INSERT INTO tb_cidade VALUES (	275	,	'	Pacaraima	'	,	22	);
INSERT INTO tb_cidade VALUES (	276	,	'	Rorainopolis	'	,	22	);
INSERT INTO tb_cidade VALUES (	277	,	'	Sao Joao da Baliza	'	,	22	);
INSERT INTO tb_cidade VALUES (	278	,	'	Sao Luiz	'	,	22	);
INSERT INTO tb_cidade VALUES (	279	,	'	Uiramuta	'	,	22	);
INSERT INTO tb_cidade VALUES (	280	,	'	Plano Alto	'	,	23	);
INSERT INTO tb_cidade VALUES (	281	,	'	Poco das Antas	'	,	23	);
INSERT INTO tb_cidade VALUES (	282	,	'	Poligono do Erval	'	,	23	);
INSERT INTO tb_cidade VALUES (	283	,	'	Polo Petroquimico de Triunfo	'	,	23	);
INSERT INTO tb_cidade VALUES (	284	,	'	Pontao	'	,	23	);
INSERT INTO tb_cidade VALUES (	285	,	'	Ponte Preta	'	,	23	);
INSERT INTO tb_cidade VALUES (	286	,	'	Portao	'	,	23	);
INSERT INTO tb_cidade VALUES (	287	,	'	Porto Alegre	'	,	23	);
INSERT INTO tb_cidade VALUES (	288	,	'	Porto Batista	'	,	23	);
INSERT INTO tb_cidade VALUES (	289	,	'	Porto Lucena	'	,	23	);
INSERT INTO tb_cidade VALUES (	290	,	'	Porto Maua	'	,	23	);
INSERT INTO tb_cidade VALUES (	291	,	'	Porto Vera Cruz	'	,	23	);
INSERT INTO tb_cidade VALUES (	292	,	'	Porto Xavier	'	,	23	);
INSERT INTO tb_cidade VALUES (	293	,	'	Pouso Novo	'	,	23	);
INSERT INTO tb_cidade VALUES (	294	,	'	Catanduvas	'	,	24	);
INSERT INTO tb_cidade VALUES (	295	,	'	Catuira	'	,	24	);
INSERT INTO tb_cidade VALUES (	296	,	'	Caxambu do Sul	'	,	24	);
INSERT INTO tb_cidade VALUES (	297	,	'	Cedro Alto	'	,	24	);
INSERT INTO tb_cidade VALUES (	298	,	'	Celso Ramos	'	,	24	);
INSERT INTO tb_cidade VALUES (	299	,	'	Cerro Negro	'	,	24	);
INSERT INTO tb_cidade VALUES (	300	,	'	Chapadao do Lageado	'	,	24	);
INSERT INTO tb_cidade VALUES (	301	,	'	Chapeco	'	,	24	);
INSERT INTO tb_cidade VALUES (	302	,	'	Flor do Sertao	'	,	24	);
INSERT INTO tb_cidade VALUES (	303	,	'	Florianopolis	'	,	24	);
INSERT INTO tb_cidade VALUES (	304	,	'	Formosa do Sul	'	,	24	);
INSERT INTO tb_cidade VALUES (	305	,	'	Forquilhinha	'	,	24	);
INSERT INTO tb_cidade VALUES (	306	,	'	Fragosos	'	,	24	);
INSERT INTO tb_cidade VALUES (	307	,	'	Rosario do Catete	'	,	25	);
INSERT INTO tb_cidade VALUES (	308	,	'	Salgado	'	,	25	);
INSERT INTO tb_cidade VALUES (	309	,	'	Samambaia	'	,	25	);
INSERT INTO tb_cidade VALUES (	310	,	'	Santa Luzia do Itanhy	'	,	25	);
INSERT INTO tb_cidade VALUES (	311	,	'	Santa Rosa de Lima	'	,	25	);
INSERT INTO tb_cidade VALUES (	312	,	'	Santana do Sao Francisco	'	,	25	);
INSERT INTO tb_cidade VALUES (	313	,	'	Santo Amaro das Brotas	'	,	25	);
INSERT INTO tb_cidade VALUES (	314	,	'	Sao Cristovao	'	,	25	);
INSERT INTO tb_cidade VALUES (	315	,	'	Sao Domingos	'	,	25	);
INSERT INTO tb_cidade VALUES (	316	,	'	Sao Francisco	'	,	25	);
INSERT INTO tb_cidade VALUES (	317	,	'	Sao Jose	'	,	25	);
INSERT INTO tb_cidade VALUES (	318	,	'	Sao Mateus da Palestina	'	,	25	);
INSERT INTO tb_cidade VALUES (	319	,	'	Sao Jose do Rio Preto	'	,	26	);
INSERT INTO tb_cidade VALUES (	320	,	'	Sao Jose dos Campos	'	,	26	);
INSERT INTO tb_cidade VALUES (	321	,	'	Sao Lourenco da Serra	'	,	26	);
INSERT INTO tb_cidade VALUES (	322	,	'	Sao Lourenco do Turvo	'	,	26	);
INSERT INTO tb_cidade VALUES (	323	,	'	Sao Luis do Paraitinga	'	,	26	);
INSERT INTO tb_cidade VALUES (	324	,	'	Sao Luiz do Guaricanga	'	,	26	);
INSERT INTO tb_cidade VALUES (	325	,	'	Sao Manuel	'	,	26	);
INSERT INTO tb_cidade VALUES (	326	,	'	Sao Martinho Doeste	'	,	26	);
INSERT INTO tb_cidade VALUES (	327	,	'	Sao Miguel Arcanjo	'	,	26	);
INSERT INTO tb_cidade VALUES (	328	,	'	Sao Paulo	'	,	26	);
INSERT INTO tb_cidade VALUES (	329	,	'	Sao Pedro	'	,	26	);
INSERT INTO tb_cidade VALUES (	330	,	'	Sao Pedro do Turvo	'	,	26	);
INSERT INTO tb_cidade VALUES (	331	,	'	Abreulandia	'	,	27	);
INSERT INTO tb_cidade VALUES (	332	,	'	Aguiarnopolis	'	,	27	);
INSERT INTO tb_cidade VALUES (	333	,	'	Alianca do Tocantins	'	,	27	);
INSERT INTO tb_cidade VALUES (	334	,	'	Almas	'	,	27	);
INSERT INTO tb_cidade VALUES (	335	,	'	Alvorada	'	,	27	);
INSERT INTO tb_cidade VALUES (	336	,	'	Anajanopolis	'	,	27	);
INSERT INTO tb_cidade VALUES (	337	,	'	Ananas	'	,	27	);
INSERT INTO tb_cidade VALUES (	338	,	'	Angico	'	,	27	);
INSERT INTO tb_cidade VALUES (	339	,	'	Aparecida do Rio Negro	'	,	27	);
INSERT INTO tb_cidade VALUES (	340	,	'	Apinaje	'	,	27	);
INSERT INTO tb_cidade VALUES (	341	,	'	Aragacui	'	,	27	);
INSERT INTO tb_cidade VALUES (	342	,	'	Aragominas	'	,	27	);