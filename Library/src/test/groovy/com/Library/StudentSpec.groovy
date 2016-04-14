package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

   void toString() {
when:"A Student has name and email"

def student1= new Student(name:'Shola Banjo',

			email:'Sbanjo@hotmail.com')

then:"the to String method will merge them."

course.toString()=='Civil Engineering,Engineering'
            
    }
}
