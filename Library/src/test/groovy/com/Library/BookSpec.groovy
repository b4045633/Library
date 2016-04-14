package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

  void toString() {
when:"A Book has title and author"

def book1= new Book(title:'Programming',

			author:'John Doe')

then:"the to String method will merge them."

course.toString()=='Civil Engineering,Engineering'
            
    }
}
