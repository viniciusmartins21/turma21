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
		inteiro numeroImpressaoAtual = 0
		real tiraNota=0.0
		caracter continuar
		inteiro x = 0
		real creditoPos=5.0
 		real valorCreditoPos=0.0
 		real totalAtual = 0.0
       	real creditoMestrado = 0.0
        	real creditoMestradoAtual = 10.0
		
		

		//cﾃｳdigo do tipo de ensino
		escreva("ESCOLA SND\n")
		escreva("SLOGAN")
		escreva("\n")
		escreva("1-Bﾃ！CO\n")
		escreva("2-Mﾃ迂O\n")
		escreva("3-GRADUAﾃ�ﾃグ\n")
		escreva("4-Pﾃ鉄\n")
		escreva("5-MESTRADO\n")
		escreva("6-SAIR\n")
		escreva


		//cﾃｳdigo da operaﾃｧﾃ｣o desejada
		escreva("DIGITE O Cﾃ泥IGO DA OPERAﾃ�ﾃグ: ")
		leia(codigo)



		//Ensino Bﾃ｡sico (Dafhne)
		se(codigo==1){
			escreva("ESCOLINHA ENSINO BﾃヾICO ALEGRIA\n")
			escreva("A JORNADA COMEﾃ�A AQUI\n")
			escreva("\n")
			escreva("ENSINO BﾃヾICO\n")
			escreva("\n")
			
			escreva("Matrﾃｭcula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus(1-Ativo 2-Inativo): ")
			leia(status)
			escreva("\n")
			}


		//Ensino Mﾃｩdio (vinicius)
		/*se(codigo==2){
			escreva("ESCOLA ENSINO Mﾃ吋IO GREYS\n")
			escreva("A JORNADA COMEﾃ�A AQUI\n")
			escreva("\n")
			escreva("ENSINO Mﾃ吋IO\n")
			escreva("\n")
			
			escreva("Matrﾃｭcula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus(1-Ativo 2-Inativo): ")
			leia(status)
			escreva("\n")
			
			}

			para(inteiro m=0; m<3; m++){
				escreva("Qual a sua nota atual: ")
				leia(pontos [m])
				
				enquanto (parar!='S'){
					escreva("Deseja continuar adicionando nota? (S/N?)")
					leia(parar)
					total = total+pontos[m]
			}
			//se(numeroImpressaolimite ){
				//escreva("Deseja imprimir o boletim? ")
				//leia()
			}
 */

		//Graduaﾃｧﾃ｣o (--brunﾃ｣o--)
            se(codigo==3){
            escreva("ESCOLA GRADUﾃ�ﾃグ TOPZERA\n")
            escreva("A JORNADA ACABA AQUI EXTREME!!\n")
            escreva("\n")
            escreva("GRADUAﾃ�ﾃグ\n")
            escreva("\n")
            
            escreva("Matricula: ")
            leia(matricula)
            escreva("\nCPF: ")
            leia(cpf)
            escreva("\nStatus(1-Ativo 0-Inativo): ")
            leia(status)
            escreva("\n")
            
            
            /* 
             *  Usar o  bonus no media  se no momento do movimento 
             *  a media  fica negativa,
              ajusta na m�ｾ�ｽｩdia e diminuir no bonus 
              ( valor maximo de 2 pontos de bonus)
             */
                        
                para (inteiro n=0; n<3; n++){
                    
                    escreva ("\nDigite o valor da  nota: " )
                    leia (pontos[n])

                    totalAtual= totalAtual+pontos[n]
                          
                   
            }
            //nﾃ｣o pode ficar negativo ﾃｩ assim ?
            se (totalAtual<0){
                        totalAtual+=2
                    }
            escreva ("O valor total ﾃｩ : " , totalAtual)
    }



					//Pﾃｳs Graduaﾃｧﾃ｣o (--jessica--)
		se(codigo==4){
			escreva("Pﾃ鉄 GRADUAﾃ�ﾃグ ALEGRIA DE PROGRAMAR\n")
			escreva("VOCﾃ� EVOLUINDO SEMPRE!\n")
			escreva("\n")
			escreva("Pﾃ鉄 GRADUAﾃ�ﾃグ\n")
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
				}enquanto(x<3 ou continuar!='N')
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
			
			}enquanto (x<3 ou continuar!='N')
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
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = vetor, matriz, funcao;
 */