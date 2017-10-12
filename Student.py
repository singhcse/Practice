class Student:
	'Common base class for all Students'
	studentcount=0
	
	def __init__(self,name,idnumber):
		self.name=name
		self.idnumber=idnumber
		Student.studentcount+=1
		
		
	def getStudentInfo(self):
		print('Student name is : ' , self.name ,' ,Student idnumber is : ',self.idnumber)
		
		
		
	def getStudentCount(self):
		print('Total Students are %d' % Student.studentcount)	
		
		
s1 = Student('Rahul Kumar',345)
s2 = Student('Ramesh kumar',560)
s3 = Student('Shubham Singh',102)			
print('Student\'s Details')
print('-------------------------------------------------------')
s1.getStudentInfo()
s2.getStudentInfo()
s3.getStudentInfo()

print('-------------------------------------------------------')

print('Total Student\'s Number is %d' % Student.studentcount)

