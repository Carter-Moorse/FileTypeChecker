# File Type Checker
This module provides a fast and easy way to identify the MIME type of any file. It does so by using a combination of the contents and the extension of the input file. 

## Implementation
Add the Java action to a microflow and give a specialization of a FileDocument as input parameter. The Java action returns a string with the detected MIMI type of the file. The action returns "application/octet-stream" if the type of the document can not be detected. See the example folder for an example implementation.

## Dependencies
This module uses the Apacha Tika Core library.

## Limitations
This module does not verify the integrity of a file. To be able to do that you need to parse the full contents of a file, which consumes more time and memory. 
