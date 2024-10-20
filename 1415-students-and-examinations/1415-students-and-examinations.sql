# Write your MySQL query statement below
select s1.student_id , s1.student_name, s2.subject_name, count(s3.student_id) attended_exams from Students s1 cross join Subjects s2 left join Examinations s3 on s1.student_id = s3.student_id and s3.subject_name=s2.subject_name
group by s1.student_id,s1.student_name,s2.subject_name order by s1.student_id,s1.student_name,s2.subject_name 