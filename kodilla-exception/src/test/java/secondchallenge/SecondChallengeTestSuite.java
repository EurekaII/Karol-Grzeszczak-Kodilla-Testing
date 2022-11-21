package secondchallenge;

import exception.test.SecondChallenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.3));
    }
    @Test
    void testWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(4, 1.8));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.8));
    }
}
