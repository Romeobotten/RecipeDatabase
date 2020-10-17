package se.lexicon.romeobot.RecipeDatabase;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RecipeInstruction {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "instruction_id", unique = true)
    String instuctionId;
    String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String instuctionId, String instructions) {
        this.instuctionId = instuctionId;
        this.instructions = instructions;
    }

    public String getInstuctionId() {
        return instuctionId;
    }

    public void setInstuctionId(String instuctionId) {
        this.instuctionId = instuctionId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return instuctionId.equals(that.instuctionId) &&
                Objects.equals(instructions, that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instuctionId, instructions);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instuctionId='" + instuctionId + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
