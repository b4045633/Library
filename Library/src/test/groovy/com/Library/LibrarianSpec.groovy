package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

  void toString() {
when:"A Librarian has name and userName"

def librarian1= new Librarian(name:'Anthony Ige',

			userName:'Aige94')

then:"the to String method will merge them."

course.toString()=='Civil Engineering,Engineering'
            
    }
}
