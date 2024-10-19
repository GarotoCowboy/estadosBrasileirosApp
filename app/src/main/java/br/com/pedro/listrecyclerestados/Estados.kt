package br.com.pedro.listrecyclerestados

class Estados (val nome:String,val sigla:String ,val descricao:String , val img:Int,val capital:String, val regiao:String) {

    object EstadosData{
        fun getEstados(): List<Estados>{

            return listOf(
                Estados("Acre","AC", "possui cerca 164.123,738 km² e " +
                        "uma população de 830.018 habitantes (IBGE, 2022). Quem nasce nesse estado é acreano. " +
                        "Possui 22 municípios.",R.drawable.estado_01_acre,"Rio Branco","Norte"),
//                Estados("Alagoas","AL", "possui cerca 164.123,738 km² e \" +\n" +
//                        "                        \"uma população de 830.018 habitantes (IBGE, 2022). Quem nasce nesse estado é acreano. \" +\n" +
//                        "                        \"Possui 22 municípios.",R.drawable.estado_02_Alagoas),

                  Estados("Amapá","AP", "possui cerca de 142.470,76 km² e uma " +
                          "população de 733.759 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "amapaense. Possui 16 municípios.",R.drawable.estado_03_amapa,"Macapá","Norte"),

                  Estados("Amazonas","AM", "possui, aproximadamente, 1.559.255,88 km² " +
                          "e uma população de 3.941.613 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "amazonense. Possui 62 municípios e é o maior estado brasileiro em extensão " +
                          "territorial.",R.drawable.estado_04_amazonas,"Manaus","Norte"),

                  Estados("Bahia","BA", "apresenta uma área de 564.760,42 km² e " +
                          "população de 14.141.626 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "baiano. Possui 417 municípios.",R.drawable.estado_05_bahia,"Salvador","Nordeste"),

                  Estados("Ceará","CE", "tem uma área estimada em 148.894,44 km² " +
                          "e uma população de 8.794.957 habitantes (IBGE, 2022). Quem nasse nesse estado " +
                          "é cearense. Possui 184 municípios.",R.drawable.estado_06_ceara,"Fortaleza","Nordeste"),

                  Estados("Espírito Santo","ES", "possui uma área de 46.074,44 km² " +
                          "e uma população total de 3.833.712 habitantes (IBGE, 2022). Quem nasce nesse " +
                          "estado é capixaba ou espírito-santense. Possui 78 municípios.",R.drawable.estado_07_espirito_santo,"Vitória","Sudeste"),

                  Estados("Goiás","GO", "compreende uma área de 340.242,85 km² e uma " +
                          "população de 7.056.495 habitantes (IBGE, 2022). Quem nasce nesse estado é goiano. " +
                          "Possui 246 municípios.",R.drawable.estado_08_goias,"Goiânia","Centro Oeste"),

                  Estados("Maranhão","MA", "possui uma área de, aproximadamente, " +
                          "329.651,49 km² e uma população de 6.775.805 habitantes (IBGE, 2022). " +
                          "Quem nasce nesse estado é maranhense. Possui 217 municípios.",R.drawable.estado_09_maranhao,"São Luís","Nordeste"),

                  Estados("Mato Grosso","MT", " possui uma área de 903.208,36 km² e, " +
                          "aproximadamente, 3.658.649 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "mato-grossense. Possui 141 municípios.",R.drawable.estado_10_mato_grosso,"Cuiabá","Centro Oeste"),

                  Estados("Mato Grosso do Sul","MS", "abrange uma área de, " +
                          "aproximadamente, 357.142,08 km² e uma população total de 2.757.013 habitantes (IBGE, 2022). " +
                          "Quem nasce nesse estado é sul-mato-grossense. Possui 77 municípios."
                      ,R.drawable.estado_11_mato_grosso_sul,"Campo Grande","Centro Oeste"),

                  Estados("Minas Gerais","MG", " apresenta uma área de 586.513,98 km² " +
                          "e uma população de 20.539.989 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "mineiro. Possui 853 municípios, sendo o estado com o maior número de municípios do país."
                      ,R.drawable.estado_12_minas_gerais,"Belo Horizonte","Sudeste"),

                  Estados("Pará","PA", "apresenta cerca de 1.245.870,70 km² e uma " +
                          "população total de 8.120.131 habitantes (IBGE, 2022). Quem nasce nesse estado é " +
                          "paraense. Possui 144 municípios.",R.drawable.estado_13_para,"Belém","Norte"),

                  Estados("Paraíba","PB", "abrange uma área de 56.467,24 km² e " +
                          "tem uma população de 3.974.687 habitantes (IBGE, 2022). Quem nasce nesse " +
                          "estado é paraibano. Possui 223 municípios.",R.drawable.estado_14_paraiba,"Jõao Pessoa","Nordeste"),

                  Estados("Paraná","PR", "apresenta uma área de, aproximadamente, " +
                          "199.298,98 km² e uma população total de 11.444.380 habitantes (IBGE, 2022). " +
                          "Quem nasce nesse estado é paranaense. Possui 399 municípios.",R.drawable.estado_15_parana,"Curitiba","Sul"),

                  Estados("Pernambuco","PE", "compreende uma área de, aproximadamente, " +
                          "98.067,87 km² e tem população de 9.058.931 habitantes (IBGE, 2022). " +
                          "Quem nasce nesse estado é pernambucano. Possui 185 municípios.",R.drawable.estado_16_pernambuco,"Recife","Nordeste"),

            Estados("Piauí","PI", "possui 251.755,48 km², aproximadamente, e uma " +
                    "população de 3.271.199 habitantes (IBGE, 2022). Quem nasce nesse estado é piauiense. " +
                    "Possui 224 municípios.",R.drawable.estado_17_piaui,"Teresina","Nordeste"),

    Estados("Rio de Janeiro","RJ", " compreende uma área de, aproximadamente, " +
            "43.750,42 km² e uma população total de 16.055.174 habitantes (IBGE, 2022). Quem nasce nesse " +
            "estado é fluminense. Possui 92 municípios.",R.drawable.estado_18_rio_de_janeiro,"Rio de Janeiro","Sudeste"),

 Estados("Rio Grande do Norte","RN", "abrange uma área de, aproximadamente, " +
         "52.809,59 km² e tem uma população total de 3.302.729 habitantes (IBGE, 2022). " +
         "Quem nasce nesse estado é norte-rio-grandense ou potiguar. Possui 167 municípios."
     ,R.drawable.estado_19_rio_grande_norte,"Natal","Nordeste"),

 Estados("Rio Grande do Sul","RS", "compreende uma área de, aproximadamente, " +
         "281.707,15 km² e uma população total de 10.882.965 habitantes. (IBGE, 2022) " +
         "Quem nasce nesse estado é gaúcho ou sul-rio-grandense. Possui 497 municípios."
     ,R.drawable.estado_20_rio_grande_sul,"Porto Alegre","Sul"),

 Estados("Rondônia","RO", "apresenta cerca de 237.754,17 km² e uma população " +
         "total 1.581.196 habitantes (IBGE, 2022). Quem nasce nesse estado é rondoniense. " +
         "Possui 52 municípios.",R.drawable.estado_21_rondonia,"Porto Velho","Norte"),

 Estados("Roraima","RR", "possui 223.644,53 km² e uma população total de 636.707 " +
         "habitantes (IBGE, 2022). É o estado menos populoso do Brasil. Quem nasce nesse estado é " +
         "roraimense. Possui 15 municípios.",R.drawable.estado_22_roraima,"Boa Vista","Norte"),

 Estados("Santa Catarina","SC", " abrange uma área de 95.730,69 km² e " +
         "apresenta uma população total de 7.610.361 habitantes (IBGE, 2022). Quem nasce nesse estado " +
         "é catarinense. Possui 295 municípios.",R.drawable.estado_23_santa_catarina,"Florianópolis","Sul"),

 Estados("São Paulo","SP", "abrange uma área de 248.219,48 km² e um total " +
         "aproximado de 44.411.238 habitantes (IBGE, 2022). É, por isso, o estado mais populoso do " +
         "Brasil. Quem nasce nesse estado é paulista. Possui 645 municípios.",R.drawable.estado_24_sao_paulo,"São Paulo","Sudeste"),

 Estados("Sergipe","SE", "possui uma área de cerca de 21.938,18 km² e um total de " +
         "2.210.004 habitantes (IBGE, 2022). Quem nasce nesse estado é sergipano. Possui 75 municípios," +
         " e é o menor estado em extensão territorial do Brasil.",R.drawable.estado_25_sergipe,"Aracaju","Nordeste"),

 Estados("Tocantins","TO", "abrange uma área de 277.423,62 km² e possui uma população" +
         " de 1.511.460 habitantes (IBGE, 2022). Quem nasce nesse estado é tocantinense. Possui 139 municípios."
     ,R.drawable.estado_26_tocantins,"Palmas","Norte"),

 Estados("Distrito Federal","DF", "possui cerca de 5.760,78 km² e uma população " +
         "total de 2.817.381 habitantes (IBGE, 2022). Quem nasce no Distrito Federal é brasiliense."
     ,R.drawable.estado_27_distrito_federal,"Brasília","Centro Oeste"),
            )
        }
    }
}