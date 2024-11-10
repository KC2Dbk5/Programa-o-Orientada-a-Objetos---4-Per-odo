public class TelevisorComDVD extends Televisor implements DVD{
 TelevisorComDVD () {
 canal = 31;
 tamanho = "20 polegadas";
 modelo = "PHILCO";
 }
 public String eject ( ) {
 return "Eject ativado";
 }
 public String play ( ) {
 return "Função Play ativada";
 }
 public String stop ( ) {
 return "Função Stop ativada";
 }
 public String pause ( ) {
 return "Função Pause ativada";
 }
}