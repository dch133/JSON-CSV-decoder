# JSON-CSV-decoder

We will use three design patterns: Singleton, Factory, and Strategy

TypeSafe Configuration Library
A basic requirement of implementing a general purpose application is to use configuration to pass different properties. TypeSafe config library has proven itself a powerful player in this area. It also uses a special document type called HOCON. 

Elements:
- Configuration class singleton: Configuration class will read configuration file that is in this case by default reference.conf and instantiates the variables.
- FileReaderParse interface for two different file types: JSON and CSV. Check out subscriber.json and subscriber.csv for the format of each line. Each line is an input to the parseSubscriber method of FileReaderParser and converts it to an instance of Subscriber.
- Strategy pattern is implemented for InputSource class: inject any implementation of FileReaderParser. 
- Factory pattern implemented to instantiate a FileReaderParser based on value of "type" given in the Configuration class
