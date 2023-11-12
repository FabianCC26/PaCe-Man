int led = 5;
int buttonArriba = 9;
int buttonAbajo = 8;
int buttonDerecha = 7;
int buttonIzquierda = 6;

bool mensajeEnviado = true;

void setup() {
  pinMode(led, OUTPUT);
  pinMode(buttonArriba, INPUT);
  pinMode(buttonAbajo, INPUT);
  pinMode(buttonDerecha, INPUT);
  pinMode(buttonIzquierda, INPUT);

  Serial.begin(9600);
}

void loop() {
  bool stateArriba = digitalRead(buttonArriba);
  bool stateAbajo = digitalRead(buttonAbajo);
  bool stateDerecha = digitalRead(buttonDerecha);
  bool stateIzquierda = digitalRead(buttonIzquierda);

  if (stateArriba == HIGH && mensajeEnviado) {
    digitalWrite(led, HIGH);
    Serial.println("Arriba");
    mensajeEnviado = false;
  } else if (stateAbajo == HIGH && mensajeEnviado) {
    digitalWrite(led, HIGH);
    Serial.println("Abajo");
    mensajeEnviado = false;
  } else if (stateIzquierda == HIGH && mensajeEnviado) {
    digitalWrite(led, HIGH);
    Serial.println("Izquierda");
    mensajeEnviado = false;
  } else if (stateDerecha == HIGH && mensajeEnviado) {
    digitalWrite(led, HIGH);
    Serial.println("Derecha");
    mensajeEnviado = false;
  } else {
    digitalWrite(led, LOW);
    if (!stateArriba && !stateAbajo && !stateIzquierda && !stateDerecha) {
      mensajeEnviado = true; 
    }
  }
}
