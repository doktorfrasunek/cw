SELECT empno, deptno, ename, mgr, job from emp;
SELECT * from emp;
SELECT sal*12 pensja from emp;
SELECT ename, sal*12 pensja , (sal+250) * 12 pensjapod from emp;
SELECT ename, sal*12 as "placa roczna" from emp;
SELECT ename, (sal+ coalesce(comm , 0))*12 as "placa roczna" from emp;
SELECT distinct deptno from emp;
SELECT * from emp order by ename desc;
SELECT * from emp order by deptno, sal desc;
SELECT  deptno, dname from dept where deptno>20;
SELECT ename, mgr from emp where mgr in (7902,7566,7788);
SELECT * FROM emp where ename like 'S%';
SELECT 
    *
FROM
    emp
WHERE
    ename LIKE '____';
Select * from emp where sal not between 1000 and 2000;
Select * from emp where sal > 1500 and job= 'mgr' or job='salesman';
