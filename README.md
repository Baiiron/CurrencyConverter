🇨🇴 ESPAÑOL

🌎 Convertidor de Divisas

¡Bienvenido al Convertidor de Divisas! Esta aplicación, desarrollada en Java con Maven, permite realizar conversiones rápidas entre varias monedas. A través de la biblioteca Gson y la API ExchangeRate-API, el programa accede a tasas de cambio actualizadas en tiempo real.

🪙 Monedas Disponibles

Este convertidor admite las siguientes monedas principales:

    🇺🇸 USD: Dólar Estadounidense
    🇨🇴 COP: Peso Colombiano
    🇪🇺 EUR: Euro
    🇦🇷 ARS: Peso Argentino

También cuenta con la opción de seleccionar otras divisas, proporcionando flexibilidad para realizar conversiones adicionales.

🛠️ Tecnologías Empleadas

    Java: Lenguaje de programación principal.
    Maven: Herramienta para la gestión de dependencias y proyectos.
    Gson: Biblioteca para manipular datos JSON.
    ExchangeRate-API: Servicio para obtener tipos de cambio en tiempo real.

⚙️ Requisitos Previos

Antes de iniciar el proyecto, asegúrate de tener:

    ☕ JDK 17
    📦 Maven
    🖥️ IntelliJ IDEA (recomendado)
    🌐 Conexión a Internet (para acceder a las tasas de cambio)

🚀 Pasos para Ejecutar

Sigue estos pasos para poner en marcha el convertidor en tu computadora:

    Clona el repositorio:

git clone https://github.com/Baiiron/CurrencyConverter.git

Accede al directorio del proyecto:

cd Currency-Converter

Compila el proyecto usando Maven:

mvn clean install

Ejecuta la aplicación:

    java -jar target/Currency-Converter.jar

🔄 Cómo Funciona

La aplicación solicita la cantidad y las monedas de origen y destino. Mediante la API ExchangeRate-API, obtiene el tipo de cambio actual y, con la ayuda de Gson, procesa los datos en JSON para una conversión eficiente y precisa.


🇺🇸 ENGLISH

🌎 Currency Converter

Welcome to the Currency Converter! This application, developed in Java with Maven, allows for quick conversions between various currencies. Using the Gson library and the ExchangeRate-API, the program provides access to real-time exchange rates.

🪙 Supported Currencies

This converter supports the following main currencies:

    🇺🇸 USD: United States Dollar
    🇨🇴 COP: Colombian Peso
    🇪🇺 EUR: Euro
    🇦🇷 ARS: Argentine Peso

It also includes an option to select additional currencies, giving you flexibility for more conversions.

🛠️ Technologies Used

    Java: Main programming language.
    Maven: Tool for project and dependency management.
    Gson: Library for handling JSON data.
    ExchangeRate-API: Service to retrieve real-time exchange rates.

⚙️ Prerequisites

Before starting the project, ensure you have:

    ☕ JDK 17
    📦 Maven
    🖥️ IntelliJ IDEA (recommended)
    🌐 Internet connection (to access exchange rates)

🚀 Steps to Run

Follow these steps to run the converter on your computer:

    Clone the repository:

git clone https://github.com/Baiiron/CurrencyConverter.git

Enter the project directory:

cd Currency-Converter

Compile the project using Maven:

mvn clean install

Run the application:

    java -jar target/Currency-Converter.jar

🔄 How It Works

The application requests an amount and the source and target currencies. Using the ExchangeRate-API, it retrieves the latest exchange rate and processes JSON data with Gson for an efficient and accurate conversion.

📝 License

This software is licensed under the MIT License.

📝 Licencia

Este software está licenciado bajo la MIT License.
