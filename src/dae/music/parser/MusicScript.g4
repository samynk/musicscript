grammar MusicScript;

@header {
    package dae.music.parser;
}

score: SCORE ID LBRACE property* part* RBRACE;
part: PART ID LBRACE property* voice* RBRACE;
voice: VOICE INT LBRACE (MEASURE measure)+ MEASURE RBRACE;
measure: clef? fifths? time? (note|notegroup)* lyrics*;
note: alteration? NOTE octave? duration?; 
notegroup: NOTEGROUPSTART note* NOTEGROUPEND duration?;
lyrics: LYRICS STRING;
alteration: PLUS|MINUS|EQUAL;
octave: (PLUS|MINUS) INT;
duration: DURATION INT;
property: ID EQUAL (STRING|(PLUS|MINUS)?INT|BOOLEAN) SC;
clef: CLEF ID;
fifths: FIFTHS (PLUS|MINUS)INT;
time: TIME INT DURATION INT;

SCORE: 'score';
PART: 'part';
VOICE: 'voice';
MEASURE: '|';
DURATION: '/';
LBRACE: '{';
RBRACE: '}';
SC: ';';
CLEF: '&';
FIFTHS: 'fifths';
TIME: '%';
LYRICS: '@';
NOTE:  'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' | [a-gA-GrR] ;
NOTEGROUPSTART: '[';
NOTEGROUPEND: ']';

PLUS: '+';
MINUS: '-';
EQUAL: '=';



INT: [0-9]+['.']?;
DIGIT: [0-9];

STRING: ["]~('"')*["];
BOOLEAN: 'true' | 'false';
ID : ([a-z]|[A-Z])+[a-zA-Z0-9]* ;
LINES : [ \t\r\n] -> skip ; // newlines

