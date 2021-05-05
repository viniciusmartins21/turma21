programa
{
	
	funcao inicio()

	{
		inteiro codigo=0
		inteiro matricula=0
		cadeia cpf
		real pontos[3]
		logico status 
		caracter movimento
		real total= 0.00
		caracter parar 
		parar = 'N'
		caracter boletimImpressao 
		boletimImpressao = 'N'
		inteiro numeroImpressaolimite = 3
		caracter numeroImpressaoAtual 
		real tiraNota=0.0
		caracter continuar
		inteiro x = 0
		real creditoPos=5.0
 		real valorCreditoPos=0.0
 		real totalAtual = 0.0
       	real creditoMestrado = 0.0
        	real creditoMestradoAtual = 10.0
        	inteiro tamanho=3
       
		
		

		//cﾃｳdigo do tipo de ensino
		escreva("ESCOLA SND\n")
		escreva("SLOGAN")
		escreva("\n")
		escreva("1-BASICO\n")
		escreva("2-MEDIO\n")
		escreva("3-GRADUACAO\n")
		escreva("4-POS\n")
		escreva("5-MESTRADO\n")
		escreva("6-SAIR\n")


		//cﾃｳdigo da operaﾃｧﾃ｣o desejada
		escreva("DIGITE O CODIGO DA OPERACAO: ")
		leia(codigo)



		//Ensino Bﾃ｡sico (Dafhne)
		logico dataNascimento = verdadeiro

	limpa()
			se(codigo==1){
			escreva("ESCOLA ALEGRIA PROGRAMA\n")
			escreva("SEU FUTURO AQUI !!!\n")
			escreva("\n")
			escreva("BASICO\n")
			escreva("\n")

			escreva("Matricula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus digite 1-Ativo (verdadeiro) ou 2-Inativo (falso) : ")
			leia(status)
			escreva("\n")
			
                               
			para (inteiro n=0; n<tamanho; n++){
               	escreva ("\n")
				escreva("\nMOVIMENTOS (I-inclusão de nota ou R-retirada nota) : ")
				leia(movimento)
					
				escreva("\nDigite a nota que deseja incluir ou excluir: ")
				leia(pontos[x])
				escreva ("\n")	
					se(pontos[x] > 0){
						
						se(movimento=='I'){
							total = pontos[x] + total
							}
				
						senao{
						total= total - pontos[x]
						}		
				
					}

         		
					escreva ("O valor total é: " , total)
					
				}
					escreva ("\nHoje é seu aniversario? ")
					leia (dataNascimento)


				se (dataNascimento){
					total=total*0.1+total}
		
					escreva ("O valor total é: " , total)
	
	
}



		//Ensino Mﾃｩdio (vinicius)	
			
			limpa()
			se(codigo==2){
			escreva("ESCOLA ENSINO MEDIO GREYS\n")
			escreva("SEU FUTURO É AQUI !!!\n")
			escreva("\n")
			escreva("MEDIO\n")
			escreva("\n")

			escreva("Matricula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus digite 1-Ativo (verdadeiro) ou 2-Inativo (falso) : ")
			leia(status)
			escreva("\n")

			
			
			para (inteiro n=0; n<tamanho; n++){
               	escreva ("\n")
				escreva("\n (Inclua sua nota: ")
				leia(movimento)
					
				escreva ("\n")
				escreva("\nMOVIMENTOS (I-Continuar ou R-Para) : ")
				leia(movimento)

				se(movimento=='I'){
					escreva ("Digite a nota que você quer incluir:  " )
					leia(pontos[x])
					escreva ("\n")	
				}

					total = pontos[x] + total 
					escreva (total)

					
					
					se(movimento=='R'){
						escreva ("Imprimindo seu boletim...")
						escreva ("\n")
						escreva ("seu boletim é:" , total)
										
					}

					
			}
			}

//fim

		
			se(codigo==3){
			escreva("ESCOLA ALEGRIA PROGRAMA\n")
			escreva("SEU FUTURO AQUI !!!\n")
			escreva("\n")
			escreva("GRADUACAO\n")
			escreva("\n")

			escreva("Matricula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus digite 1-Ativo (verdadeiro) ou 2-Inativo (falso) : ")
			leia(status)
			escreva("\n")
			}
                               
			para (inteiro n=0; n<tamanho; n++){
               	escreva ("\n")
				escreva("\nMOVIMENTOS (I-inclusão de nota ou R-retirada nota) : ")
				leia(movimento)
					
				escreva("\nDigite a nota que deseja incluir ou excluir: ")
				leia(pontos[x])
				escreva ("\n")	
					se(pontos[x] > 0){
						
						se(movimento=='I'){
							total = pontos[x] + total
							}
				
						senao{
						total= total - pontos[x]
						}		
				
					}

         		
					escreva ("O valor total é: " , total)
				}

				se (total<0){
				total+=2}
		
					escreva ("O valor total é: " , total)



					//Pﾃｳs Graduaﾃｧﾃ｣o (--jessica--)
		se(codigo==4){
			escreva("POS-GRADUAÇÃO UNI10\n")
			escreva("SEU FUTURO É AQUI !!!\n")
			escreva("\n")
			escreva("POS-GRADUAÇÃO\n")
			escreva("\n")

			escreva("Matricula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus digite 1-Ativo (verdadeiro) ou 2-Inativo (falso) : ")
			leia(status)
			escreva("\n")
			

			faca{
				escreva("Pontos totais atual: ", total)
				
				se(x==0){
					escreva("\nPrimeira operaﾃｧﾃ｣o ﾃｩ incluir nota!")
					escreva("\nDigite a nota que deseja incluir: ")
					leia(pontos[x])
					total = pontos[x] + total
					}

					
				senao{
					escreva("\nMOVIMENTOS (I-inclusﾃ｣o de nota ou R-retirada nota: ")
					leia(movimento)
					escreva("\nDigite a nota que deseja incluir ou excluir: ")
					leia(pontos[x])
					
					se(pontos[x] > 0){
						se(movimento=='I'){
							total = pontos[x] + total
						}
						
						senao{
							total= total - pontos[x]
						}
					}
					senao{
					escreva("\nDigite um valor vﾃ｡lido(positivo): ")
					leia(pontos[x])
						se(movimento=='I'){
							total = pontos[x] + total
						}
						
						senao{
							total= total - pontos[x]
						}
					
					}	
				}

				se(creditoPos>0){
				escreva("Solicitar uso de crﾃｩdito?(S/N): ")
				leia(continuar)
					se(continuar=='S'){
						escreva("Seu crﾃｩdito atual ﾃｩ de: ",creditoPos ,". Quantos creditos deseja usar?: ")
						leia(valorCreditoPos)
						creditoPos = creditoPos - valorCreditoPos
						total = total + valorCreditoPos
						}
				}
				senao{
					escreva("Vocﾃｪ nﾃ｣o possui mais crﾃｩdito!\n")
					}
				x++
				escreva("Continuar S/N?: ")
				leia(continuar)
				}enquanto(x<3 e continuar!='N')
				escreva("Movimentos finalizados!\n")
					
					se(creditoPos>0){
						escreva("Solicitar uso de crﾃｩdito?(S/N): ")
						leia(continuar)
						se(continuar=='S'){
							escreva("Seu crﾃｩdito atual ﾃｩ de: ",creditoPos ,". Quantos creditos deseja usar?: ")
							leia(valorCreditoPos)
							creditoPos = creditoPos - valorCreditoPos
							total = total + valorCreditoPos
							}
					}
					escreva("Crﾃｩditos restantes: ",creditoPos)
					escreva("\nTotal de pontos: ",total)
				
		}
		
					//Pﾃｳs Graduaﾃｧﾃ｣o (--jessica--)


		//Mestrado (Malu)
		se(codigo==5){
			escreva("Universidade de Tecnologia\n")
			escreva("SEU DESENVOLVIMENTO COMEﾃ�A AQUI!\n")
			escreva("\n")
			escreva("MESTRADO\n")
			escreva("\n")
			
			escreva("Matrﾃｭcula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			//escreva("\nStatus(1-Ativo 2-Inativo): ")
			//leia(status)
			escreva("\n")

			limpa()

			//processamento

			
			faca{
				escreva ("O total de pontos atual ﾃｩ: ", totalAtual)

				se(x==0){ //Primeira nota - primeiro espaﾃｧo
					escreva ("\nDigite sua nota: ")
					leia (pontos[x])
					totalAtual = totalAtual + pontos [x]
				}

				senao{
					escreva("\nMOVIMENTOS: I para incluir nota ou R para retirada nota: ")
					leia(movimento)
					escreva("\nDigite a nota que deseja incluir ou excluir: ")
					leia(pontos[x])
			

					se(pontos [x] >0){ //nota for maior que 0
					se(movimento=='I'){ //para incluir nota
						totalAtual = pontos[x] + totalAtual
					}
					senao{ //para excluir nota
						totalAtual = totalAtual - pontos[x]
					}
				}
					senao { //?????
					escreva ("\nDigite um valor vﾃ｡lido(positivo): ")
					leia(pontos[x])
					se(movimento=='I'){ //para incluir nota
						totalAtual = pontos[x] + totalAtual
					}
					senao{ //para excluir nota
						totalAtual = totalAtual - pontos[x]
					}
				}
			}

			se(creditoMestradoAtual>0){
				escreva("Gostaria de solicitar o uso de seu credito: (S/N): ")
				leia (continuar)
				se(continuar =='S'){
					escreva("Seu crﾃｩdtio atual ﾃｩ: ",creditoMestradoAtual,". Quantos crﾃｩditos deseja utilizar:? ")
					leia(creditoMestrado)
					creditoMestradoAtual = creditoMestradoAtual - creditoMestrado
					totalAtual = totalAtual + creditoMestrado
					
				}
			}

			senao{
				escreva("\nSeus crﾃｩditos acabaram")
			}
			x++
			escreva ("Continuar S/N?: ")
			leia(continuar)
			
			}enquanto (x<3 e continuar!='N')
			escreva ("\nFim dos Movimentos!")

				se(creditoMestrado>0){
				escreva("Gostaria de solicitar o uso de seu credito: (S/N): ")
				leia (continuar)
				se(continuar =='S'){
					escreva("Seu crﾃｩdtio atual ﾃｩ: ",creditoMestradoAtual,". Quantos crﾃｩditos deseja utilizar:? ")
					leia(creditoMestrado)
					creditoMestradoAtual = creditoMestradoAtual - creditoMestrado
					totalAtual = totalAtual + creditoMestrado
					
				}
			}

			escreva ("\nO restante de crﾃｩditos ﾃｩ: ",creditoMestradoAtual)
			escreva ("\nO total de pontos ﾃｩ: ",totalAtual) 
		
			}
		}
	

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3027; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = vetor, matriz, funcao;
 */