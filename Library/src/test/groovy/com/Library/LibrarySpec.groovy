package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

  void toString() {
when:"A Library has location and librarian"

def library1= new Library(location:'Sheffield',

			librarian:'Anthony Ige')

then:"the to String method will merge them."

course.toString()=='Civil Engineering,Engineering'
            
    }
}
