CREATE OR REPLACE FUNCTION calculate_total(m1 INT, m2 INT, m3 INT)
RETURNS INT AS $$
DECLARE
    total INT;
BEGIN
    total := m1 + m2 + m3;
    RETURN total;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE PROCEDURE student_result(m1 INT, m2 INT, m3 INT)
LANGUAGE plpgsql
AS $$
DECLARE
    total INT;
BEGIN
    -- Call function
    total := calculate_total(m1, m2, m3);

    -- Display total
    RAISE NOTICE 'Total Marks: %', total;

    -- Check result
    IF total >= 150 THEN
        RAISE NOTICE 'Result: PASS';
    ELSE
        RAISE NOTICE 'Result: FAIL';
    END IF;
END;
$$;
CALL student_result(50, 60, 40);