# Bitmap Transformer
## About
An application written in Java that allows the user to use command line to input a bitmap file, transform bitmaps and write transformed bitmaps to desired locations. 

## Contributors
Functional code that reads and writes files and transforms image to grayscale written by:
* Sharina Stubbs
* Paula Cruz

Modularized code, following best practice for OOP, tests and additional transforms written by:
* Sharina Stubbs

## How to run the application
As application is currently written, it is designed to be run through the command line using gradlew. 
* the first argument will be the relative input filepath (ie, assets/mario.bmp) 
* the second argument will be the output for the relative filepath (ie, assets/newMario.bmp)
* the third argument will be `no` if no transformation is desired, just a copy. If a transformation is desired, the third argument will be the name of a transformation available (ie, grayscale)

### gradlew command with an example
```
./gradlew run --args 'assets/mario.bmp assets/newMario.bmp grayscale'
```

## Current transformations available, to be used as the third argument in the command line:
### Turn a color image into grayscale
`grayscale`
### Make a copy of an image
`no`
### Turn colors of the image into shades of green
`green`
### Fill image with solid shade of pink, obliterating original image
`pink-box`




