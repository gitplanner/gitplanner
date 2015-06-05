package eventlog;

import java.io.Serializable;
import java.util.UUID;

public final class EventId implements Serializable {
	private static final long serialVersionUID = 1L;
	public final UUID uuid;
	
	public EventId()
	{
		uuid = UUID.randomUUID();
	}

	public EventId(String id) {
		uuid = UUID.fromString(id);
	}
	
	public EventId(UUID id) {
		if(id == null) throw new NullPointerException("id can't be null");
		uuid = id;
	}

	@Override
	public int hashCode() {
		return uuid.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EventId))
			return false;
		EventId other = (EventId) obj;
		return uuid.equals(other.uuid);
	}

	@Override
	public String toString() {
		return uuid.toString();
	}
}
