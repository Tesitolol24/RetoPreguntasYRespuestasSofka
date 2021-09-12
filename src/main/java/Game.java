import domain.Question;

public class Game {
    public static void main(String[] args) {
        //25 instancias de la clase Question / generar preguntas
        //Preguntas Faciles
        Question question1 = new Question(1, "¿Cual es el resultado de sumar 20 + 10?", "Matematicas", "a", "A. 30", "B. 10", "C. 120", "D. Ninguna de las Anteriores");
        Question question2 = new Question(2, "¿Cual es la unidad mas pequeña en que se divide la materia?", "Ciencias", "c", "A. Celula", "B. Nucleo", "C. Atomo", "D. Helio");
        Question question3 = new Question(3, "¿Cual fue el ganador del mundial de 2014?", "Facil", "d", "A. Argentina", "B. Brasil", "C. Colombia", "D. Alemania");
        Question question4 = new Question(4, "¿Cual de estos No hace parte de los juegos mas jugados en el mundo?", "Entretenimiento", "a", "A. Chivalry2", "B. GTA V", "C. Minecraft", "D. Dota 2");
        Question question5 = new Question(5, "¿En que continente esta ubicado Colombia?", "Geografia", "c", "A. Asia", "B. Oceania", "C. America", "D. Africa");
        //Preguntas Medias
        Question question6 = new Question(6, "¿Cual es el rio mas largo del mundo?", "Cultura General", "b", "A. Rio Tamesis", "B. Amazonas", "C. Sena", "D. Volga");
        Question question7 = new Question(7, "¿?Cual es el pais con mas habitantes del mundo", "Cultura general", "d", "A. Rusia", "B. EEUU", "C. Holanda", "D. China");
        Question question8 = new Question(8, "En que año se callo el muro de Berlin", "Cultura general", "a", "A. En 1989", "B. En 1998", "C. En 1999", "D. En 1997");
        Question question9 = new Question(9, "¿Cual es el oceano mas grande del mundo?", "Cultura general", "d", "A. Artico", "B. Indico", "C. Atlantico", "D. Pacifico");
        Question question10 = new Question(10, "Cual disco es el mas vendido de la historia", "Cultura general", "c", "A. Come on over", "B. Back in black", "C. Thriller", "D. The darkside of the moon");
        //Preguntas Dificiles
        Question question11 = new Question(11, "¿Si 20 es el 100% cuanto es el 90%?", "Matematica", "a", "A. 45", "B. 35", "C. 25", "D. 55");
        Question question12 = new Question(12, "¿Cual es mas pequeño, un atomo, una celula, una particula o una molecula?", "Ciencias", "c", "A. Molecula", "B. Celula", "C. Atomo", "D. Particula");
        Question question13 = new Question(13, "Si 1 es igual a 2 cual es el resultado de: 2 - 1 + 2 - 1", "Logica", "d", "A. -1", "B. 0", "C. 2", "D. 1");
        Question question14 = new Question(14, "¿Quien invento el telescopio?", "Historia", "c", "A. Lyman Spitzer", "B. Platon", "C. Hans Lippershey", "D. Socrates");
        Question question15 = new Question(15, "¿Quien invento el microscopio?", "Historia", "a", "A. Galileo", "B. Socrates", "C. Platon", "D. Hamlet");
        //Preguntas Experto
        Question question16 = new Question(16, "¿Cual era el primer nombre del Rey Jorge IV?", "Historia", "b", "A. Ragnar", "B. Alberto", "C. Ivan", "D. Hector");
        Question question17 = new Question(17, "¿Cual es el dia mas largo de la semana?", "Cultura general", "a", "A. Miercoles", "B. Sabado", "C. Martes", "D. Domingo");
        Question question18 = new Question(18, "¿Quien creo la escultura Las Puertas Del Infierno?", "Arte", "d", "A. Pierre Auguste", "B. Constantin Braincusi", "C. Auguste Eugine", "D. Auguste Rodin");
        Question question19 = new Question(19, "¿Quien creo la teoria del big bang?", "Ciencias", "a", "A. Georges Lemaitre", "B. Charles Darwin", "C. Lamark", "D. Martin Lutero");
        Question question20 = new Question(20, "¿En que año se invento el microscopio?", "Historia", "c", "A. 1914", "B. 1896", "C. 1916", "D. 1921");
        //Preguntas Legendarias
        Question question21 = new Question(21, "¿Como fue echa la animacion de Disney en sus inicios?", "Arte", "c", "A. Stop Motion", "B. Motion Graphics", "C. Animacion cuadro a cuadro", "D. Animacion 3D");
        Question question22 = new Question(22, "¿Quien pinto la Capilla Sixtina?", "Arte", "d", "A. Donatello", "B. Van Gogh", "C. Davinci", "D. Miguel Angel");
        Question question23 = new Question(23, "¿Quien pinto la noche estrellada?", "Arte", "d", "A. Davinci", "B. Socrates", "C. Miguel Angel", "D. Van Gogh");
        Question question24 = new Question(24, "¿En que año dio su inicio la santa inquisicion?", "Historia", "a", "A. 1478", "B. 1520", "C. 1462", "D. 1476");
        Question question25 = new Question(25, "¿Que obra teatral inica con esta frase: 'Cual gritan esos malditos pero mal rayo me parta si concluyendo esta carta no pagan caros sus gritos'?" , "Obra Teatral", "b", "A. Hamlet", "B. Don Juan Tenorio", "C. La celestina", "D. Edipo Rey");

    }
}
